package org.example.lesson_6

fun main() {

    println("Введите количество секунд")
    val inputSeconds = readIntSeconds()
    timer(inputSeconds)

}

fun readIntSeconds(): Int {
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

fun timer(seconds: Int) {

    var timeLeft = seconds
    println("Старт")

    while (timeLeft > 0) {

        print("\rОсталось секунд: $timeLeft    ")
        Thread.sleep(1000)
        timeLeft--

    }
    println("\rВремя вышло")

}