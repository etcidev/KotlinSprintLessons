package org.example.lesson_9

const val INGREDIENTS_COUNT = 5

fun main() {
    val ingredients = mutableSetOf<String>()

    while (ingredients.size < INGREDIENTS_COUNT) {
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