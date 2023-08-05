package com.rubabe.wellness.text

fun findMaxNumber(arr: IntArray): Int {
    if (arr.count() < 2) {
     println("It is must greater than 2")
    }

    var largestNumber = maxOf(arr[0], arr[1])
    var secondLargestNumber = minOf(arr[0], arr[1])
    var smallestNumber = secondLargestNumber
    var secondSmallestNumber = largestNumber

    for (i in 2 until arr.count()) {
        if (arr[i] > largestNumber) {
            secondLargestNumber = largestNumber
            largestNumber = arr[i]
        } else if (arr[i] > secondLargestNumber) {
            secondLargestNumber = arr[i]
        }

        if (arr[i] < smallestNumber) {
            secondSmallestNumber = smallestNumber
            smallestNumber = arr[i]
        } else if (arr[i] < secondSmallestNumber) {
            secondSmallestNumber = arr[i]
        }
    }

    val product1 = largestNumber * secondLargestNumber
    val product2 = smallestNumber * secondSmallestNumber

    return maxOf(product1, product2)
}

fun main() {
    val arr = intArrayOf(8, 1, 14, 3, 2)
    val maxNumber = findMaxNumber(arr)
    println("Maximum product of two integers in the array: $maxNumber")
}
