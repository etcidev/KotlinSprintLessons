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
        if (stats is Temperature) {
            println("Температура в городе ${stats.city}: ${stats.temperature}°C")
        } else if (stats is PrecipitationAmount) {
            println("Количество осадков в городе ${stats.city}: ${stats.precipitationAmount} мм")
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