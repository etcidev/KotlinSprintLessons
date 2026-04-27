package org.example.lesson_9

fun main() {

    val ingredientCounts = listOf(2, 50, 15)

    println("Введите количество порций")

    val portionCount = readPortionCount()

    val requiredIngredientCounts = ingredientCounts.map { it * portionCount }

    println(
        "На $portionCount порций вам понадобится: Яиц – ${requiredIngredientCounts[0]}, " +
            "молока – ${requiredIngredientCounts[1]}, сливочного масла – ${requiredIngredientCounts[2]}"
    )

}

fun readPortionCount(): Int {
    while (true) {
        val input = readln().toIntOrNull()

        if (input == null) {
            println("Введите число")
            continue
        }
        if (input < 0) {
            println("Количество порций должно быть >= 0")
            continue
        }

        return input
    }
}