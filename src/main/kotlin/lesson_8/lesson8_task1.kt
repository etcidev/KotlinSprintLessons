package org.example.lesson_8

fun main() {

    val dailyViews = IntArray(7)

    for (i in dailyViews.indices) {

        dailyViews[i] = readViewsForDay(i + 1)

    }

    println(dailyViews.sum())

}

fun readViewsForDay(day: Int): Int {

    while (true) {

        println("Введите количество просмотров за $day день")
        val input = readln().toIntOrNull()

        if (input != null && input >= 0) {
            return input
        }

        println("Ошибка: введите число >= 0")

    }

}