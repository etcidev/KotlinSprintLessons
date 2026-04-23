package org.example.lesson_7

const val MIN_RANGE = 1000
const val MAX_RANGE = 9999

fun main() {

    do {
        val code = (MIN_RANGE..MAX_RANGE).random()

        println("Ваш код авторизации: $code")
        println("Введите код")

        val userCode = readln().toIntOrNull()

        if (userCode == code) {
            println("Вы успешно авторизовались!")
            return
        }

    } while (true)

}