package org.example.lesson_9

const val INGREDIENTS_COUNT = 5

fun main() {

    val ingredients: List<String>

    println("Введите $INGREDIENTS_COUNT ингредиентов через запятую")

    while (true) {

        val input = readln()

        val parsed = input.split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }

        if (parsed.size == INGREDIENTS_COUNT) {
            ingredients = parsed
            break
        }

        println("Введите ровно $INGREDIENTS_COUNT ингредиентов через запятую")
    }

    ingredients.sorted().forEach {
        println(it)
    }

}