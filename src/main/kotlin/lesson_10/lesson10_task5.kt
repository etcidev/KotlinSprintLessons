package org.example.lesson_10

const val USER_LOGIN = "жывотнайе"
const val USER_PASSWORD = "ф Бабруйск"
const val ACCESS_TOKEN_LENGTH = 32

fun main() {

    val token = authenticate(login = USER_LOGIN, password = USER_PASSWORD)
    val cart = getCart(token)

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

fun getCart(accessToken: String?): List<String>? {
    val cartItems = listOf("Хлеб", "Молоко", "Яйца")
    return accessToken?.let { cartItems }
}


