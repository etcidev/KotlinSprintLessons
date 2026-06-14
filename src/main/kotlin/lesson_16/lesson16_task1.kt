package org.example.lesson_16

class Dice {
    private val value = (1..6).random()

    fun printValue() = println(value)
}

fun main() {
    val dice = Dice()
    dice.printValue()
}