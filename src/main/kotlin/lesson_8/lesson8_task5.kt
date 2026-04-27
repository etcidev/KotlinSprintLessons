package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов")

    val ingredientCount = readIngredientCount()

    val ingredients = Array(ingredientCount) {
        println("Введите ингредиент ${it + 1}")
        readln()
    }

    println(ingredients.joinToString(", "))

}

fun readIngredientCount(): Int {

    while (true) {
        val input = readln().toIntOrNull()

        if (input != null && input > 0) return input
        println("Ошибка: введите число > 0")
    }

}