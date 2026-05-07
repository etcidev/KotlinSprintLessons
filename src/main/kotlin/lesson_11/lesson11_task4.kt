package org.example.lesson_11

class Category(
    val name: String,
    val description: String,
    val imageUrl: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val name: String,
    val servings: Int,
    val imageUrl: String,
    val isFavorite: Boolean = false,
    val ingredients: List<Ingredient>,
    val method: List<String>,
)

class Ingredient(
    val name: String,
    val quantity: String,
    val unitOfMeasure: String,
)
