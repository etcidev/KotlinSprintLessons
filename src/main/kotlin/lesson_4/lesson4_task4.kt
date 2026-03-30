package org.example.lesson_4

fun main() {

    val dayNumber = 5

    val isArmsAndAbsDay = dayNumber % 2 != 0

    println(
        """
        | Упражнения для рук: $isArmsAndAbsDay
        
        | Упражнения для ног: ${!isArmsAndAbsDay}
        
        | Упражнения для спины: ${!isArmsAndAbsDay}
        
        | Упражнения для пресса: $isArmsAndAbsDay
        """.trimMargin()
    )

}