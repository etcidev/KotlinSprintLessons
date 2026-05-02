package org.example.lesson_9

const val TOTAL_INGREDIENT_COUNT = 5

fun main() {
    val ingredients = mutableSetOf<String>()

    while (ingredients.size < TOTAL_INGREDIENT_COUNT) {
        println("Введите ингредиент №${ingredients.size + 1}")
        val input = readln().trim().lowercase()

        if (input.isBlank()) {
            println("Вы ничего не ввели")
            continue
        }

        if (!ingredients.add(input)) {
            println("Такой ингредиент уже есть")
        }
    }

    println(
        ingredients
            .sorted()
            .joinToString(", ")
            .replaceFirstChar { it.uppercase() }
    )

}