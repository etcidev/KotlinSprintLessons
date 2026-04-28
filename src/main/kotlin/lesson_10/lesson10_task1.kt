package org.example.lesson_10

const val MIN_DICE_VALUE = 1
const val MAX_DICE_VALUE = 6

fun main() {

    println("Игра началась!")

    val playerRoll = rollDice()

    println("Игрок бросает кость...")
    println("Выпало: $playerRoll")

    val computerRoll = rollDice()

    println("Компьютер бросает кость...")
    println("Выпало: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество")
        playerRoll < computerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }

}

fun rollDice() = (MIN_DICE_VALUE..MAX_DICE_VALUE).random()