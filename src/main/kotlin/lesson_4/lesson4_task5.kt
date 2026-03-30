package org.example.lesson_4

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_BOXES_OF_PROVISIONS = 50

fun main() {

    val isDamaged = readBoolean("Есть повреждение у корпуса? (true/false):")
    val crewSize = readInt(
        "Введите число экипажа:",
        "Ошибка: число экипажа не может быть отрицательным"
    )
    val numberBoxesOfProvisions = readInt(
        "Введите количество ящиков с провизией:",
        "Ошибка: количество ящиков не может быть отрицательным"
    )
    val isWeatherFavorable = readBoolean("Благоприятная погода или нет? (true/false):")

    val canSail = canShipSail(isDamaged, crewSize, numberBoxesOfProvisions, isWeatherFavorable)

    println("Корабль может отправляться в плавание: $canSail")

}

fun readBoolean(message: String): Boolean {
    while (true) {
        println(message)

        val input = readLine()?.trim()?.lowercase()

        if (input == "true" || input == "false") {
            return input.toBoolean()
        }

        println("Ошибка: допускаются только true или false")
    }
}

fun readInt(
    message: String,
    errorMessage: String
): Int {
    while (true) {
        println(message)

        val input = readLine()?.trim()?.toIntOrNull()

        if (input == null) {
            println("Ошибка: это не число")
            continue
        }

        if (input < 0) {
            println(errorMessage)
            continue
        }

        return input
    }
}

fun canShipSail(
    isDamaged: Boolean,
    crewSize: Int,
    numberBoxesOfProvisions: Int,
    isWeatherFavorable: Boolean
): Boolean {
    return (
        !isDamaged &&
            crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE
            && numberBoxesOfProvisions > MIN_BOXES_OF_PROVISIONS
        ) ||
        (
            isDamaged &&
                crewSize == MAX_CREW_SIZE &&
                numberBoxesOfProvisions >= MIN_BOXES_OF_PROVISIONS &&
                isWeatherFavorable
            )
}


