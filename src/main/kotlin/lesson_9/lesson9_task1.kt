package org.example.lesson_9

fun main() {

    val ingredients = listOf("вода", "голова летучей мыши", "эссенция из шкуры жопы дракона")

    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")

    ingredients.forEach {
        println(it)
    }

}