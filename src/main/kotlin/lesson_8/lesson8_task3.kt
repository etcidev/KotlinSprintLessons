package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Соль", "Перец", "Морковь", "Лук")

    println("Напишите ингредиент, который хотите найти")

    val input = readln().trim()

    val foundIngredient = ingredients.find { it.equals(input, ignoreCase = true) }

    if (foundIngredient == null) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Ингредиент $foundIngredient в рецепте есть")
    }
}