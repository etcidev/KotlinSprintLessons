package org.example.lesson_7

const val MIN_RANGE = 1000
const val MAX_RANGE = 9999

fun main() {

    var code: Int

    do {
        code = (MIN_RANGE..MAX_RANGE).random()

        println("Ваш код авторизации: $code")
        println("Введите код")

        val userCode = readln().toIntOrNull()

    } while (userCode != code)

    println("Вы успешно авторизовались!")
}