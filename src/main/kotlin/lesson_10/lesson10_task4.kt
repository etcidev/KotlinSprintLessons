package org.example.lesson_10

const val MIN_DICE = 1
const val MAX_DICE = 6
const val ANSWER_YES = "да"

fun main() {
    var playerWins = 0

    println("Игра началась!")

    while (true) {
        if (playRound()) {
            playerWins++
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")

        if (!readln().trim().equals(ANSWER_YES, ignoreCase = true)) {
            println("Вы выиграли $playerWins раз(а)")
            return
        }
    }
}

fun rollDice(): Int = (MIN_DICE..MAX_DICE).random()

fun playRound(): Boolean {
    println("Игрок бросает кость...")
    val playerRoll = rollDice()
    println("Выпало: $playerRoll")

    println("Компьютер бросает кость...")
    val computerRoll = rollDice()
    println("Выпало: $computerRoll")

    return when {
        playerRoll > computerRoll -> {
            println("Победило человечество")
            true
        }

        playerRoll < computerRoll -> {
            println("Победила машина")
            false
        }

        else -> {
            println("Победила дружба")
            false
        }
    }
}