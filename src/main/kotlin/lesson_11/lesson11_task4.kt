package org.example.lesson_11

class Category(
    val name: String,
    val description: String,
    val picture: Int,

)

class Recipe(
    val name: String,
    val servings: Int,
    val picture: Int,
    val isFavorite: Boolean = false,
    val ingredients: List<Ingredient>,
)

class Ingredient(
    val name: String,
    val amount: String,
)
