package org.example.lesson_13

class ContactCard(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val contacts = listOf(
        ContactCard("Васиcуалий", 111111111L, "Пульс"),
        ContactCard("Поликарп", 222222222L, "Аврора"),
        ContactCard("Эдуард", 333333333L, null),
        ContactCard("Вениамин", 4444444444L, null),
        ContactCard("Филимон", 555555555555L, "null")
    )

    contacts.mapNotNull { it.company }.forEach { println(it) }
}

