package org.example.lesson_10

const val MIN_PASSWORD_LENGTH = 2

fun main() {
    val passwordLength = readPasswordLength()

    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun readPasswordLength(): Int {
    println("Введите длину пароля")

    while (true) {
        val input = readln().toIntOrNull()
        if (input == null) {
            println("Ошибка: введите число")
            continue
        }

        if (input < MIN_PASSWORD_LENGTH) {
            println("Длина пароля должна быть >= $MIN_PASSWORD_LENGTH")
            continue
        }

        return input
    }
}

fun generatePassword(length: Int): String {
    val digits = '0'..'9'
    val specialChars = "!\"#\$%&'()*+,-./ "

    var password = ""

    for (i in 0 until length) {
        password += if (i % 2 == 0) {
            digits.random()
        } else {
            specialChars.random()
        }
    }

    return password
}