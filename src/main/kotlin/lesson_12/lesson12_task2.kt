package org.example.lesson_12

class WeatherDay(
    val dailyTemperature: Double,
    val nightTemperature: Double,
    val isPrecipitationExpected: Boolean,
) {

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
    val weatherDay1 = WeatherDay(10.0, 20.0, false)

    weatherDay1.printWeather()
}