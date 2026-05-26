package org.example.lesson_14

open class LinerShip(
    open val speed: Int = 100,
    open val cargoCapacity: Int = 10000,
    open val numberPassengers: Int = 7000,
    open val canBreakIce: Boolean = false,
) {
    open fun load() {
        println("Горизонтальный трап выдвинут")
    }

    fun printInfo() {
        println(
            """
            Скорость: $speed
            Грузоподъемность: $cargoCapacity
            Пассажиры: $numberPassengers
            Может колоть лед: $canBreakIce
            """.trimIndent()
        )
    }
}

class CargoVessel : LinerShip() {
    override val speed = 80
    override val cargoCapacity = 20000
    override val numberPassengers = 1000

    override fun load() {
        println("Активирован погрузочный кран")
    }
}

class IcebreakerShip : LinerShip() {
    override val speed = 50
    override val cargoCapacity = 5000
    override val numberPassengers = 500
    override val canBreakIce = true

    override fun load() {
        println("Открыты ворота со стороны кормы")
    }
}

fun main() {
    val linerShip = LinerShip()
    linerShip.load()
    linerShip.printInfo()
    println()

    val cargoVessel = CargoVessel()
    cargoVessel.load()
    cargoVessel.printInfo()
    println()

    val icebreakerShip = IcebreakerShip()
    icebreakerShip.load()
    icebreakerShip.printInfo()
}