package com.oneobjectinc.metaprogramming

/**
 * Created by saberseddik on 2015-10-08.
 */
class Message {

}

Message.metaClass.methodMissing ={ String name, args ->
    println name
}

new Message().sayHello()
new Message().'hgff fghf fhfh fgfhfh'()
