package org.example.lesson_6

const val MIN_NUM = 1
const val MAX_NUM = 9
const val NUM_OF_ATTEMPTS = 3

fun main() {

    println("Докажите, что вы не бот")
    var attemptsLeft = NUM_OF_ATTEMPTS

    while (attemptsLeft > 0) {

        val (number1, number2) = getRandomPair()

        println("Найдите сумму: $number1 + $number2 =")

        val userAnswer = readAnswer()

        if (userAnswer == number1 + number2) {

            println("Добро пожаловать!")
            return
        }
        attemptsLeft--

    }

    println("Доступ запрещён")
}

fun readAnswer(): Int {
    while (true) {

        val input = readln().toIntOrNull()

        if (input == null) {
            println("Ошибка: это не число")
            continue
        }

        return input
    }
}

fun getRandomPair() =
    (MIN_NUM..MAX_NUM).random() to (MIN_NUM..MAX_NUM).random()