package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20
const val WINTER = "Зима"

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidityToday = 20
    val season = "Зима"

    val result = checkingConditions(
        isSunny,
        isAwningOpen,
        airHumidityToday,
        season
    )

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}

fun checkingConditions(
    isSunny: Boolean,
    isAwningOpen: Boolean,
    airHumidityToday: Int,
    season: String
): Boolean = isSunny && isAwningOpen && airHumidityToday == REQUIRED_HUMIDITY && season != WINTER

