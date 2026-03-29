package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var weight = 20
    var volume = 80


    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}"
    )

}