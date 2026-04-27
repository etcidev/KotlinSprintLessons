package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Соль", "Перец", "Мясо", "Томаты")

    println(ingredients.joinToString(", "))

    println("Какой ингредиент хотите заменить?")

    val input = readln().trim()
    val index = ingredients.indexOfFirst { it.equals(input, true) }

    if (index == -1) {
        println("Ингредиента $input нет в списке")
    } else {
        println("Какой ингредиент вы хотите добавить?")

        val ingredientToAdd = readln().trim()

        ingredients[index] = ingredientToAdd
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
    }

}