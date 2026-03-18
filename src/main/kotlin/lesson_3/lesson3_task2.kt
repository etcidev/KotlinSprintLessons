package org.example.lesson_3


fun main() {

    val name = "Татьяна"
    var surname = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20
    val surnameHusband = "Сидоров"

    println("$surname $name $patronymic, $age")
    age = 22
    surname = surnameHusband + "a"
    println("$surname $name $patronymic, $age")

}



