package org.example.lesson_14

open class Liner(
    open val speed: Int = 100,
    open val carrying: Int = 10000,
    open val numberPassengers: Int = 7000,
    open val canBreakIce: Boolean = false,
)

class CargoShip : Liner() {
    override val speed = 80
    override val carrying = 20000
    override val numberPassengers = 1000
}

class Icebreaker : Liner() {
    override val speed = 50
    override val carrying = 5000
    override val numberPassengers = 500
    override val canBreakIce = true
}

fun main() {
    val liner1 = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
}