package org.example.lesson_9

const val INGREDIENTS_COUNT = 5

fun main() {

    println("Введите $INGREDIENTS_COUNT ингредиентов через запятую")

    val ingredients = readln().split(", ")

    if (ingredients.size != INGREDIENTS_COUNT) {
        println("Ошибка: нужно ввести ровно $INGREDIENTS_COUNT ингредиентов")
        return
    }

    if (ingredients.any { it.isBlank() }) {
        println("Ошибка: ингредиенты не должны быть пустыми")
        return
    }

    println(ingredients.sorted().joinToString(", "))

}