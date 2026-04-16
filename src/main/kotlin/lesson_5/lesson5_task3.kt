package org.example.lesson_5

const val MIN = 0
const val MAX = 1

fun main() {

    val winNumber1 = (MIN..MAX).random()
    val winNumber2 = (MIN..MAX).random()
    var userNumber1: Int? = null
    var userNumber2: Int? = null

    val winningNumbers = listOf(winNumber1, winNumber2)
    println(winningNumbers)

    val winningNumbersCounts = winningNumbers.groupingBy { it }.eachCount()

    println("Введите первое число:")

    while (userNumber1 == null) {
        userNumber1 = readln().toIntOrNull()
        if (userNumber1 == null) println("Введите число:")
    }

    println("Введите второе число:")

    while (userNumber2 == null) {
        userNumber2 = readln().toIntOrNull()
        if (userNumber2 == null) println("Введите число:")
    }

    val userNumbers = listOf(userNumber1, userNumber2)

    val userNumbersCounts = userNumbers.groupingBy { it }.eachCount()

    var matchesCount = 0

    for (number in winningNumbersCounts.keys) {
        val winCount = winningNumbersCounts[number]!!
        val userCount = userNumbersCounts[number] ?: 0

        matchesCount += minOf(winCount, userCount)
    }

    val result = if (matchesCount == 0) "Неудача!"
    else if (matchesCount == 1) "Вы выиграли утешительный приз!"
    else "Поздравляем! Вы выиграли главный приз!"

    println(result)

}