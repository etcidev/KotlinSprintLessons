package org.example.lesson_12

const val KELV_OFFSET = 273

class DailyForecast(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    val isPrecipitationExpected: Boolean,
) {
    val dailyTemperature = dailyTemperatureKelvin - KELV_OFFSET
    val nightTemperature = nightTemperatureKelvin - KELV_OFFSET

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