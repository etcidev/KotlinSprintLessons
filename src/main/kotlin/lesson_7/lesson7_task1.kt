package org.example.lesson_7

const val PASSWORD_COUNT = 6

fun main() {

    val letters = 'a'..'z'
    val digits = '0'..'9'

    var password = ""

    for (i in 1..PASSWORD_COUNT) {

        password += if (i % 2 == 0) {
            digits.random()
        } else {
            letters.random()
        }

    }
    println(password)
}


