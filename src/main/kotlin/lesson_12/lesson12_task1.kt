package org.example.lesson_12

class DailyWeather {
    var dailyTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var isPrecipitationExpected: Boolean = false

    fun printWeather() {
        println(
            """
            Дневная температура: $dailyTemperature
            Ночная температура: $nightTemperature
            Осадки: $isPrecipitationExpected
        """.trimIndent()
        )
    }
}

fun main() {
    val dailyWeather1 = DailyWeather()
    val dailyWeather2 = DailyWeather()

    dailyWeather1.dailyTemperature = 10.0
    dailyWeather1.nightTemperature = -100.0
    dailyWeather1.isPrecipitationExpected = true

    dailyWeather2.dailyTemperature = 100.0
    dailyWeather2.nightTemperature = -10.0
    dailyWeather2.isPrecipitationExpected = false

    dailyWeather1.printWeather()
    dailyWeather2.printWeather()
}