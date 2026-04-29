package org.example.lesson_10

const val MIN_CREDENTIAL_LENGTH = 4

fun main() {
    println("Напишите логин")
    val login = readln().trim()

    println("Напишите пароль")
    val password = readln().trim()

    if (isValidLength(login, password)) {
        println("Привет, $login")
    } else println("Логин или пароль недостаточно длинные")

}

fun isValidLength(login: String, password: String): Boolean {
    return login.length >= MIN_CREDENTIAL_LENGTH &&
        password.length >= MIN_CREDENTIAL_LENGTH
}