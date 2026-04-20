package org.example.lesson_6

fun main() {

    println("Придумайте свой логин")
    val userName = readln()
    println("Придумайте пароль")
    val userPassword = readln()
    println("Спасибо за регистрацию!")

    var inputUserName: String
    var inputUserPassword: String

    do {
        println("Введите логин")
        inputUserName = readln()

        println("Введите пароль")
        inputUserPassword = readln()

        if (inputUserName != userName || inputUserPassword != userPassword) {
            println("Неверный логин или пароль. Попробуйте снова.")
        }

    } while (inputUserName != userName || inputUserPassword != userPassword)

    println("Авторизация прошла успешно")

}
