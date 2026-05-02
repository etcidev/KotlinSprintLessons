package org.example.lesson_10

const val MIN_DICE_VALUE = 1
const val MAX_DICE_VALUE = 6

fun main() {
    println("Игра началась!")

    println("Игрок бросает кость...")
    val playerRoll = rollGameDice()
    println("Выпало: $playerRoll")

    println("Компьютер бросает кость...")
    val computerRoll = rollGameDice()
    println("Выпало: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество")
        playerRoll < computerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollGameDice(): Int = (MIN_DICE_VALUE..MAX_DICE_VALUE).random()