package com.rubabe.wellness.text

//Kotlinde exceptionslari handle etmek ucun trycatch istifade olunur
fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("An ArithmeticException occurred: ${e.message}")
    }
    return 0
}

fun main() {
    val result = divide(10, 0)
    println("Result: $result")
}
