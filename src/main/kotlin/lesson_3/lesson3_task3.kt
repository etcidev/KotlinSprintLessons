package org.example.lesson_3

fun main() {

    val number = 3

    var result = ""

    for (i in 1..9) {
        result += "$number * $i = ${i * number}\n"
    }

    println(result)

}