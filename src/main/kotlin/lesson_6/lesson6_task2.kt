package org.example.lesson_6

fun main() {

    println("Введите количество секунд")
    val inputSeconds = readInt()
    Thread.sleep(inputSeconds * 1000L)

    println("Прошло $inputSeconds секунд")

}

fun readInt(): Int {
    while (true) {

        val inputSeconds = readln().toIntOrNull()

        if (inputSeconds == null) {
            println("Ошибка: это не число")
            continue
        }

        if (inputSeconds <= 0) {
            println("Ошибка: число не может быть <= 0")
            continue
        }

        return inputSeconds
    }
}

