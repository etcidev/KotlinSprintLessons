package org.example.lesson_9

const val CONFIRM_YES = "да"

fun main() {

    val ingredients = mutableListOf("вода", "голова летучей мыши", "эссенция из шкуры жопы дракона")

    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString(", ")}")

    println("Желаете добавить еще?")

    val userAnswer = readln().trim()

    if (!userAnswer.equals(CONFIRM_YES, true)) return

    println("Какой ингредиент вы хотите добавить?")

    val ingredientToAdd = readln().trim()

    ingredients.add(ingredientToAdd)

    println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")

}