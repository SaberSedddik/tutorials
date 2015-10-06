package com.oneobjectinc.files

/**
 * Created by saberseddik on 15-10-06.
 */
def arguments = args as List

new File('/Users/saberseddik/IdeaProjects/Tutorials/Groovy/out/production/Groovy/main/resources/com/oneobjectinc/files/inputFile').eachLine {
    println it
}

