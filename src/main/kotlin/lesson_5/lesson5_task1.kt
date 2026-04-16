package org.example.lesson_5

const val MIN = 1
const val MAX = 100

fun main() {

    val (number1, number2) = getRandomPair()

    println("Докажи, что не бот")

    println("Чему равна сумма: $number1 + $number2")

    val input = readLine()?.toIntOrNull()

    if (input == number1 + number2) println("Добро пожаловать!")
    else println("Доступ запрещён.")

}

fun getRandomPair() =
    (MIN..MAX).random() to (MIN..MAX).random()