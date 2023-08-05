package com.rubabe.wellness.text

//Constructor- Classdan obyekt yaratmaq ucun lazim olan structurdur. classin proportielerini initialize etmek ucun istifade olunur.
//Primary Constructor ve Second Constructor var
//PrimaryConstructor classin MainConstructorudur. Classin headerinde class adindan sonra yazilir. Onun vasitəsilə classin  properties and parametersini mueyyen etmek olur. Clasin icindeki variablelara baslagic valuelari vermek ucun istifade olunur.

//1. Primary Constructor(Proporties)
class Animal(val type: String, val color: Int) {

}

//2. Empty
class Car {
}

//3.Initialization Block
class Server(name: String, power: Int) {
    private val studentName: String
    private val studentAge: Int

    init {
        studentName = name
        studentAge = power
    }
}

//4.  No Visibility Modifiers
class Vehicle(make: String, type: String) {
    val vehicleMake: String = make
    val vehicleType: String = type
}


//5. Initialization Block and Visibility Modifiers
class Student private constructor(private val name: String) {
    init {
        println("Student created with name: $name")
    }
}

//6.Default Parameter Values
class Person(val name: String? = null, val age: Int = 0)
