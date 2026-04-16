package org.example.lesson_5

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = Year.now().value
    var userYearOfBirth: Int? = null

    println("Введите год своего рождения:")

    while (userYearOfBirth == null) {
        userYearOfBirth = readln().toIntOrNull()
        if (userYearOfBirth == null) {
            println("Введите число")
        }

    }

    val userAge = currentYear - userYearOfBirth

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Идите учить уроки")

}