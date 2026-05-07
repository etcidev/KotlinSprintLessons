package org.example.lesson_12

const val KELVIN_OFFSET = 273

class WeatherForecast(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    isPrecipitationExpected: Boolean,
) {
    val dailyTemperature = dailyTemperatureKelvin - KELVIN_OFFSET
    val nightTemperature = nightTemperatureKelvin - KELVIN_OFFSET
    val isPrecipitationExpected = isPrecipitationExpected

    init {
        println(
            """
            Дневная температура: $dailyTemperature °C
            Ночная температура: $nightTemperature °C
            Осадки: $isPrecipitationExpected
            """.trimIndent()
        )
    }
}

fun main() {
    WeatherForecast(
        dailyTemperatureKelvin = 300,
        nightTemperatureKelvin = 280,
        isPrecipitationExpected = true,
    )
}