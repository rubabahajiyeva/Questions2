package com.rubabe.wellness.text


fun main() {
    val name: String? = "Rubabe"

    name?.let {
        println("name isn't null: $it")
    }

    val nullableName: String? = null
    nullableName?.let {

        println("This won't be printed: $it")
    }
}


// Let acar sozu scoping functiondir null olmayan obyektlerde actionlari yerine yetirmetye istifade olunur. It allows you to execute a block of code on a non-null object and access the object using the it keyword within the block. The primary purpose of let is to handle nullable objects safely and avoid explicit null checks.


//object?.let { Code block to execute if the object is not null }

