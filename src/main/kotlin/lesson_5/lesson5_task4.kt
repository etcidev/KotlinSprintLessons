package org.example.lesson_5

const val REGISTERED_USERNAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"

fun main() {

    println("Введите имя пользователя.")

    when (val inputUserName = readln()) {

        REGISTERED_USERNAME -> {
            println("Введите пароль.")
            val inputUserPassword = readln()
            if (inputUserPassword == REGISTERED_PASSWORD) {
                println("Приветствуем тебя, $inputUserName, на борту.")
            } else {
                println("Не угадал. Расстрелять! ПИУ-ПИУ")
            }
        }

        else -> println("Такого пользователя нет. Вам необходимо зарегистрироваться.")

    }

}