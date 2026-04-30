package org.example.lesson_10

const val USER_LOGIN = "жывотнайе"
const val USER_PASSWORD = "ф Бабруйск"
const val ACCESS_TOKEN_LENGTH = 32

fun main() {
    val cartItems = listOf("Хлеб", "Молоко", "Яйца")

    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPassword = readln()

    val token = authenticate(login = inputLogin, password = inputPassword)
    val cart = getCart(token, cartItems)

    if (cart != null) {
        println(cart.joinToString(", "))
    } else {
        println("Неудачная авторизация")
    }
}

fun generateToken(): String {
    val chars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    return (1..ACCESS_TOKEN_LENGTH)
        .map { chars.random() }
        .joinToString("")
}

fun authenticate(login: String, password: String): String? =
    if (login == USER_LOGIN && password == USER_PASSWORD) generateToken() else null

fun getCart(accessToken: String?, cartItems: List<String>): List<String>? =
    accessToken?.let { cartItems }