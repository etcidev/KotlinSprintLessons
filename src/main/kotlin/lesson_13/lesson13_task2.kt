package org.example.lesson_13

class PhoneBookEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println(
            "Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}"
        )
    }
}

fun main() {
    val contact1 = PhoneBookEntry("Ростислав", 89123456789L, "Reddit")
}