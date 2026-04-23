package org.example.lesson_7

const val PASSWORD_PAIRS_COUNT = 3

fun main() {

    val letters = 'a'..'z'
    val digits = '0'..'9'

    val password = buildString {

        repeat(PASSWORD_PAIRS_COUNT) {
            append(letters.random())
            append(digits.random())
        }

    }

    println(password)

}