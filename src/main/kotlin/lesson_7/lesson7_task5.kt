package org.example.lesson_7

const val MINIMUM_PASSWORD_LENGTH = 6

fun main() {

    println("Введите длину пароля. Минимальная длина $MINIMUM_PASSWORD_LENGTH")

    println(getPassword(getPasswordLength()))

}

fun getPasswordLength(): Int {

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

        if (input < MINIMUM_PASSWORD_LENGTH) {
            println("Минимальная длина пароля $MINIMUM_PASSWORD_LENGTH")
            continue
        }

        return input

    }
}

fun getPassword(lengthPassword: Int): String {

    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'

    val allChars = digits + lowercaseLetters + uppercaseLetters

    // гарантируем по одному из каждого набора
    val chars = mutableListOf<Char>().apply {
        add(digits.random())
        add(lowercaseLetters.random())
        add(uppercaseLetters.random())
    }

    // Добавляем оставшееся количество символов

    repeat(lengthPassword - chars.size) {
        chars.add(allChars.random())
    }

    return chars.shuffled().joinToString("")

}