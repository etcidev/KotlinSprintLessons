package org.example.lesson_6

fun main() {

    println("Придумайте свой логин")
    val userName = readln()
    println("Придумайте пароль")
    val userPassword = readln()
    println("Спасибо за регистрацию!")

    while (!isAuthorized(userName, userPassword)) {

        println("Неверный логин или пароль. Попробуйте снова.")

    }

    println("Авторизация прошла успешно")

}

fun isAuthorized(userName: String, userPassword: String): Boolean {

    println("Введите логин")
    val inputUserName = readln()
    println("Введите пароль")
    val inputUserPassword = readln()

    return inputUserName == userName && inputUserPassword == userPassword

}