package org.example.lesson_3

fun main() {

    val messageOfAMove = "D2-D4;0"

    val splitMessageOfAMove = messageOfAMove.split("-", ";")
    val start = splitMessageOfAMove[0]
    val end = splitMessageOfAMove[1]
    val moveNumber = splitMessageOfAMove[2]

    println("Откуда: $start")
    println("Куда: $end")
    println("Номер хода: $moveNumber")

}