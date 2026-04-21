package org.example.lesson_6

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 5

fun main() {

    val randomNumber = (MIN_NUMBER..MAX_NUMBER).random()

    println("Угадайте число. У вас $NUMBER_OF_ATTEMPTS попыток")

    var attemptsLeft = NUMBER_OF_ATTEMPTS

    while (attemptsLeft > 0) {

        val inputUserNumber = readUserNumber()

        if (inputUserNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        }

        attemptsLeft--

        if (attemptsLeft > 0) {
            println("Неверно. Осталось попыток: $attemptsLeft")
        }

    }

    println("Было загадано число $randomNumber")
}

fun readUserNumber(): Int {
    while (true) {

        val input = readln().toIntOrNull()

        if (input == null) {
            println("Ошибка: это не число")
            continue
        }

        if (input !in MIN_NUMBER..MAX_NUMBER) {
            println("Ошибка: назовите число от $MIN_NUMBER до $MAX_NUMBER")
            continue
        }

        return input
    }
}