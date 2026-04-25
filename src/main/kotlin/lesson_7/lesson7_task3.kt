package org.example.lesson_7

fun main() {

    val userNumber: Int

    while (true) {
        println("Введите число")
        val input = readln().toIntOrNull()

        if (input != null && input > 0) {
            userNumber = input
            break
        }
    }

    for (i in 0..userNumber step 2) {
        print("$i ")
    }
}