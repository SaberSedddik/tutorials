package com.oneobjectinc.files
import au.com.bytecode.opencsv.*

/**
 * Created by saberseddik on 15-10-06.
 */
def arguments = args as List
def fileLocation = '/Users/saberseddik/IdeaProjects/Tutorials/Groovy/out/production/Groovy/main/resources/com/oneobjectinc/files/inputFile'
def keyValuePattern = /([^@]*)@([^@]*)@/
def folder =new File("/tmp/${new Date().time}/")
folder.mkdir()
new File(fileLocation).eachLine { line, idx ->
    def keys=[]
    def values=[]
    line.findAll(keyValuePattern) { all, key, value ->
        keys<<key
        values<<value
    }
    def output=new File(folder,"${idx}.csv".toString())
    output.createNewFile()
    output.append(keys.join(','))
    output.append('\n')
    output.append(values.join(','))
}

