package org.example.lesson_7

fun main() {

    println("Введите количество секунд")

    val userSeconds = getSeconds()

    println("Старт")

    // В Kotlin вместо console.log — println
    println("DEBUG: старт таймера")

    for (i in userSeconds downTo 0) {

        if (i > 0) {
            println("Осталось $i секунд")
            Thread.sleep(1000)

        } else {
            println("Время вышло")
        }

    }

}

fun getSeconds(): Int {

    while (true) {

        val input = readln().toIntOrNull()

        if (input == null) {
            println("Ошибка: это не число")
            continue
        }

        if (input <= 0) {
            println("Введите положительное число")
            continue
        }

        return input

    }
}

