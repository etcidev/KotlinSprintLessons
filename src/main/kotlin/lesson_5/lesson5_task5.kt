package org.example.lesson_5

const val MIN_VALUE = 0
const val MAX_VALUE = 42
const val WINNING_NUMBERS_COUNT = 3

const val BIG_PRIZE_MATCH_COUNT = 2
const val CONSOLATION_PRIZE_MATCH_COUNT = 1

fun main() {

    val winningNumbers = (MIN_VALUE..MAX_VALUE).shuffled().take(WINNING_NUMBERS_COUNT)

    val userNumber1 = readUserNumber()
    val userNumber2 = readUserNumber()
    val userNumber3 = readUserNumber()

    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    val matchesCount = winningNumbers.intersect(userNumbers).size

    val resultMessage = when (matchesCount) {

        WINNING_NUMBERS_COUNT ->
            "Вы угадали все $WINNING_NUMBERS_COUNT числа и выиграли джекпот!"

        BIG_PRIZE_MATCH_COUNT ->
            "Вы угадали $BIG_PRIZE_MATCH_COUNT числа и получаете крупный приз!"

        CONSOLATION_PRIZE_MATCH_COUNT ->
            "Вы угадали $CONSOLATION_PRIZE_MATCH_COUNT число и получаете утешительный приз! "

        else -> "Вы не угадали ни одного числа"

    }

    println(resultMessage)
    println("Выигрышные числа: ${winningNumbers.sorted().joinToString()}")

}


fun readUserNumber(): Int {
    var number: Int? = null

    while (number == null) {
        println("Введите число:")
        number = readln().toIntOrNull()
    }

    return number
}