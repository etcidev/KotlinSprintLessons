package org.example.lesson_15

interface Searchable {
    fun search(name: String) = println("Выполняется поиск")
}

abstract class Product(val name: String, val number: Int)

class Instrument(
    name: String,
    quantityInStock: Int,
    val accessories: MutableList<Accessory> = mutableListOf()
) : Product(name, quantityInStock), Searchable

class Accessory(
    name: String,
    number: Int,
) : Product(name, number)

fun main() {
    val strings = Accessory("Струны", 20)
    val pick = Accessory("Медиатор", 100)
    val guitar = Instrument("Гитара", 10, mutableListOf(strings, pick))

    guitar.search("Медиатор")
}