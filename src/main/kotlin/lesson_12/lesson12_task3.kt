package org.example.lesson_12

const val KELVIN_OFFSET = 273

class WeatherForecast(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    isPrecipitationExpected: Boolean,
) {
    val dailyTemperature = dailyTemperatureKelvin - KELVIN_OFFSET
    val nightTemperature = nightTemperatureKelvin - KELVIN_OFFSET
    val hasPrecipitation = isPrecipitationExpected

    fun printWeather() {
        println(
            """
            Дневная температура: $dailyTemperature °C
            Ночная температура: $nightTemperature °C
            Осадки: $hasPrecipitation
            """.trimIndent()
        )
    }
}

fun main() {
    val weatherForecast = WeatherForecast(
        dailyTemperatureKelvin = 300,
        nightTemperatureKelvin = 280,
        isPrecipitationExpected = true,
    )

    weatherForecast.printWeather()
}