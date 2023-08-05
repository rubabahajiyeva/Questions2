package com.rubabe.wellness.text

class HouseBuilder(var roomNumber: Int?) {

    data class Builder(
        var roomNumber: Int = 3
    ) {


        fun addRoom(roomNumber: Int) = apply { this.roomNumber = roomNumber }

        fun addRoom(): Builder {
            this.roomNumber = roomNumber
            return this
        }


        fun build(): HouseBuilder {
            return HouseBuilder(roomNumber)
        }
    }
}

fun main() {
    var house = HouseBuilder.Builder().addRoom(7).build()
    println(house)

}