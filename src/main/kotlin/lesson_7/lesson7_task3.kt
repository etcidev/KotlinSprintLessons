package org.example.lesson_7

fun main() {

    val userNumber: Int

    while (true) {
        println("Введите число")
        val input = readln().toIntOrNull()

        if (input != null && input >= 0) {
            userNumber = input
            break
        }
    }

    var i = 0
    while (i <= userNumber) {
        print("$i ")
        i += 2
    }
}