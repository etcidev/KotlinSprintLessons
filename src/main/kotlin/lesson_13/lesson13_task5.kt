package org.example.lesson_13

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    try {
        val phoneNumber = readln().toLong()
        println("Номер: $phoneNumber")
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}