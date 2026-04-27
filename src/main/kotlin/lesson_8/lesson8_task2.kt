package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Соль", "Перец", "Морковь", "Лук")

    println("Напишите ингредиент, который хотите найти")

    val input = readln().trim()

    var foundIngredient: String? = null

    for (ingredient in ingredients) {
        if (ingredient.equals(input, ignoreCase = true)) {
            foundIngredient = ingredient
            break
        }
    }

    if (foundIngredient != null) {
        println("Ингредиент $foundIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}