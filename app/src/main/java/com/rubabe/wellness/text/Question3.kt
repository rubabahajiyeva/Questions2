package com.rubabe.wellness.text


/*What are Decorative Patterns , and why are they useful ? Demonstrate how you can use Decorative Patterns in Kotlin to add functionality to existing classes.
*/

/*Decorative patternler classin obyektinin strukturunu deyismeden ve onun diger obyektlerle behaviorunu deyismeden istifade olunur. */

//Example
interface iAnimal {
    fun eat(): String
}

class Dog() : iAnimal {
    override fun eat(): String {
        return "Dog is eating"
    }
}

class Cat() : iAnimal {
    override fun eat(): String {
        return "Cat is eating"
    }
}


abstract class Decorator(var iAnimal: iAnimal) : iAnimal {
    override fun eat(): String {
        return iAnimal.eat()
    }
}

class LoudDecorator(iAnimal: iAnimal) : Decorator(iAnimal) {
    override fun eat(): String {
        return super.eat() + "loudly"
    }
}

class FastDecorator(iAnimal: iAnimal) : Decorator(iAnimal) {
    override fun eat(): String {
        return super.eat() + "quickly"
    }
}


fun main() {
    val animalLoudDecorator = LoudDecorator(Dog())
    val loudDecorator = animalLoudDecorator.eat()
    println(loudDecorator)


    val animalFastDecorator = FastDecorator(Cat())
    val fastDecorator = animalFastDecorator.eat()
    println(fastDecorator)
}



