package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransportable {
    val maxNumberPassengers: Int
    var numberPassengersInside: Int

    fun loadPassengers(numberPassengers: Int): Int {
        when {
            numberPassengers < 0 ->
                println("Количество пассажиров не может быть меньше 0")

            numberPassengersInside + numberPassengers <= maxNumberPassengers -> {
                println("В автомобиль село $numberPassengers пассажиров")
                numberPassengersInside += numberPassengers
            }

            else ->
                println("В автомобиль нельзя посадить больше $maxNumberPassengers пассажиров")
        }

        return numberPassengersInside
    }

    fun unloadPassengers(numberPassengers: Int) {
        when {
            numberPassengers < 0 ->
                println("Количество пассажиров не может быть меньше 0")

            numberPassengers > numberPassengersInside ->
                println("В автомобиле нет стольких пассажиров")

            else -> {
                numberPassengersInside -= numberPassengers

                if (numberPassengersInside == 0) {
                    println("Из автомобиля вышли все пассажиры")
                } else {
                    println("Из автомобиля вышло $numberPassengers пассажиров")
                }
            }
        }
    }
}

interface CargoTransportable {
    val maxCargoCapacity: Int
    var amountCargoInside: Int

    fun loadCargo(amount: Int): Int {
        when {
            amount < 0 ->
                println("Количество груза не может быть меньше 0")

            amountCargoInside + amount <= maxCargoCapacity -> {
                println("В грузовую машину загрузили $amount тонны груза")
                amountCargoInside += amount
            }

            else ->
                println("В грузовую машину нельзя загрузить больше $maxCargoCapacity тонн груза")
        }

        return amountCargoInside
    }

    fun unloadCargo(amount: Int) {
        when {
            amount < 0 ->
                println("Количество груза не может быть меньше 0")

            amount > amountCargoInside ->
                println("В машине нет столько груза")

            else -> {
                amountCargoInside -= amount
                println("Из грузового автомобиля выгрузили $amount тонны груза")
            }
        }
    }
}

abstract class Car(
    val name: String,
) : Movable {
    override fun move() = println("$name едет")
}

class Truck(
    name: String = "Грузовик",
    override val maxCargoCapacity: Int = 2,
) : Car(name), PassengerTransportable, CargoTransportable {

    override val maxNumberPassengers = 1

    override var numberPassengersInside = 0

    override var amountCargoInside = 0
}

class PassengerCar(
    name: String = "Легковая машина",
) : Car(name), PassengerTransportable {

    override val maxNumberPassengers = 3

    override var numberPassengersInside = 0
}

fun main() {

    val truck = Truck()

    truck.move()

    truck.loadPassengers(1)
    truck.loadCargo(2)

    println("Пассажиров внутри: ${truck.numberPassengersInside}")
    println("Груза внутри: ${truck.amountCargoInside}")

    truck.unloadPassengers(1)
    truck.unloadCargo(1)
    println()

    val passengerCar1 = PassengerCar()

    passengerCar1.move()

    passengerCar1.loadPassengers(3)
    println("Пассажиров внутри: ${passengerCar1.numberPassengersInside}")

    passengerCar1.unloadPassengers(2)
    println("Пассажиров внутри: ${passengerCar1.numberPassengersInside}")
    println()

    val passengerCar2 = PassengerCar()

    passengerCar2.move()

    passengerCar2.loadPassengers(2)
    println("Пассажиров внутри: ${passengerCar2.numberPassengersInside}")

    passengerCar2.unloadPassengers(2)
    println("Пассажиров внутри: ${passengerCar2.numberPassengersInside}")
}