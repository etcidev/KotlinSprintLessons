package org.example.lesson_15

abstract class User(
    val name: String
) {
    fun readForum() = println("$name читает...")
    fun postMessage(text: String) = println("$name написал сообщение: \n\t$text")
}

class RegularUser(name: String) : User(name)

class AdminUser(name: String) : User(name) {
    fun deleteMessage(author: User, message: String) {
        println("Администратор $name удалил сообщение пользователя ${author.name}: \n\t$message")
    }

    fun deleteUser(user: User) {
        println("Администратор $name удалил пользователя ${user.name}")
    }
}

fun main() {
    val user1 = RegularUser("Саруман")
    val user2 = AdminUser("Гендальф")
    val user3 = RegularUser("Орк")

    user1.postMessage("Оставь полуросликов, присоединяйся к нам!")
    user2.readForum()
    user2.postMessage("НИКОГДА! Убейся об землю!")
    user1.readForum()
    user3.readForum()
    user3.postMessage("Durbgu nazgshu, Durbu dashshu!")
    user1.readForum()
    user2.readForum()
    user2.deleteMessage(user3, "Durbgu nazgshu, Durbu dashshu!")
    user2.deleteUser(user3)
}