package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf<String>()

    var i = 1

    while (i <= 5) {

        println("Введите ингредиент №$i")

        val input = readln().trim().lowercase()

        if (input.isBlank()) {

            println("Вы ничего не ввели")
            continue
        }
        if (input in ingredients) {
            println("Такой ингредиент уже есть")
            continue
        }

        ingredients.add(input)

        i++

    }

    val sortedIngredients = ingredients.sorted().toMutableList()
    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }

    println(sortedIngredients.joinToString(", "))

}