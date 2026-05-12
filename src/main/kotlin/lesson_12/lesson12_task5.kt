package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_BASE = 273

class DailyForecast(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    val isPrecipitationExpected: Boolean,
) {
    val dailyTemperature = dailyTemperatureKelvin - KELVIN_BASE
    val nightTemperature = nightTemperatureKelvin - KELVIN_BASE
}

fun main() {
    val temperatureRange = 223..333
    val dailyForecasts = mutableListOf<DailyForecast>()

    for (i in 1..30) {
        dailyForecasts.add(
            DailyForecast(
                temperatureRange.random(),
                temperatureRange.random(),
                Random.nextBoolean(),
            )
        )
    }

    val dayTemperatures = dailyForecasts.map { it.dailyTemperature }
    val nightTemperatures = dailyForecasts.map { it.nightTemperature }
    val precipitationDaysCount = dailyForecasts.count { it.isPrecipitationExpected }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()

    println(
        """
        Средняя дневная температура: %.2f °C
        Средняя ночная температура: %.2f °C
        Количество дней с осадками: $precipitationDaysCount
        """.trimIndent().format(
            averageDayTemperature,
            averageNightTemperature,
        )
    )
}