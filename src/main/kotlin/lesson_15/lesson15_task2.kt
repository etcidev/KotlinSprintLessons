package org.example.lesson_15

abstract class WeatherStationStats(
    val city: String,
)

class Temperature(
    city: String,
    val temperature: Short,
) : WeatherStationStats(city)

class PrecipitationAmount(
    city: String,
    val precipitationAmount: Int,
) : WeatherStationStats(city)

class WeatherServer {

    fun sendMessage(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> println("Температура в городе ${stats.city}: ${stats.temperature}°C")
            is PrecipitationAmount -> println("Количество осадков в городе ${stats.city}: ${stats.precipitationAmount} мм")
            else -> println("Ошибка. Попробуйте позже.")
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()

    val temperature = Temperature("Москва", 22)
    val precipitationAmount = PrecipitationAmount("Владивосток", 5)

    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}