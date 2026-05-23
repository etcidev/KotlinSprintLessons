package org.example.lesson_13

class UserContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo() {
        println(
            "Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}"
        )
    }
}

fun main() {
    val contacts = mutableListOf<UserContact>()

    while (true) {
        println("Введите имя")
        val name = readln()

        println("Введите номер телефона")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("Номер телефона не указан. Ещё раз? Да или нет")
            if (readln().lowercase() == "нет") break
            continue
        }

        println("Введите название компании")
        val company = readln().ifBlank { null }

        contacts.add(UserContact(name, phoneNumber, company))

        println("Хотите добавить ещё один контакт? Да или нет")
        if (readln().lowercase() == "нет") break
    }

    contacts.forEach { it.printInfo() }
}
