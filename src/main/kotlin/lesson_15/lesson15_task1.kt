package org.example.lesson_15

interface Fly {
    fun fly()
}

interface Swim {
    fun swim()
}

interface Dive {
    fun dive()
}

class Crucian(private val name: String = "Карась") : Swim {
    override fun swim() {
        println("$name плавает")
    }
}

class Gull(private val name: String = "Чайка") : Fly, Dive {
    override fun fly() {
        println("$name летает")
    }

    override fun dive() {
        println("$name ныряет")
    }
}

class Duck(private val name: String = "Утка") : Swim, Fly, Dive {

    override fun fly() {
        println("$name летает")
    }

    override fun dive() {
        println("$name ныряет")
    }

    override fun swim() {
        println("$name плавает")
    }
}

fun main() {
    val crucian = Crucian()
    val duck = Duck()
    val gull = Gull()

    crucian.swim()
    gull.fly()
    gull.dive()
    duck.swim()
    duck.fly()
    duck.dive()
}