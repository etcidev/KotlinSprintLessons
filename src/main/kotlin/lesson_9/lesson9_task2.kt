package org.example.lesson_9

const val CONFIRM_YES = "да"

fun main() {

    val ingredients = mutableListOf("вода", "голова летучей мыши", "эссенция из шкуры жопы дракона")

    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { println(it) }

    println("Желаете добавить ещё?")

    if (readln().trim().equals(CONFIRM_YES, true)) {

        println("Какой ингредиент вы хотите добавить?")

        ingredients.add(readln().trim())

        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredients.forEach { println(it) }
    }

}