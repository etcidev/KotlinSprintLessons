package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    private var password: String,
    val email: String,
    var bio: String? = null
) {

    // 1. Вывод информации
    fun printInfo() {
        println("id = $id")
        println("login = $login")
        println("password = $password")
        println("email = $email")
        println("bio = ${bio ?: "не указано"}")
    }

    // 2. Ввод bio
    fun updateBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    // 3. Смена пароля
    fun changePassword() {
        println("Введите текущий пароль:")
        val current = readln()

        if (current == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "sergey",
        password = "123456",
        email = "sergey@gmail.com"
    )

    user.updateBio()
    user.changePassword()

    println()
    println("Обновленная информация:")
    user.printInfo()
}