package org.example.lesson_12

const val KELVIN_OFFSET = 273

class DailyForecast(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    val isPrecipitationExpected: Boolean,
) {
    val dailyTemperature = dailyTemperatureKelvin - KELVIN_OFFSET
    val nightTemperature = nightTemperatureKelvin - KELVIN_OFFSET

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
    DailyForecast(
        dailyTemperatureKelvin = 300,
        nightTemperatureKelvin = 280,
        isPrecipitationExpected = true,
    )
}