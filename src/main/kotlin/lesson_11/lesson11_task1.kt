package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User(1, "sergey", "123456", "sergey@gmail.com")
    val user2 = User(2, "ivan", "qwerty", "ivan@gmail.com")

    println("User1:")
    println("id = ${user1.id}, login = ${user1.login}, password = ${user1.password}, email = ${user1.email}")

    println()

    println("User2:")
    println("id = ${user2.id}, login = ${user2.login}, password = ${user2.password}, email = ${user2.email}")
}