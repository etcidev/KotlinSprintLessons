package org.example.lesson_14

const val BLACK = "Чёрный"
const val WHITE = "Белый"

abstract class Figure(
    val color: String,
) {
    abstract fun perimeter(): Double
    abstract fun area(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun perimeter(): Double = 2 * Math.PI * radius
    override fun area(): Double = Math.PI * radius * radius

}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun perimeter(): Double = 2 * (width + height)
    override fun area(): Double = width * height
}

fun main() {
    val circle1 = Circle(BLACK, 5.0)
    val circle2 = Circle(WHITE, 10.0)

    val rectangle1 = Rectangle(BLACK, 10.0, 5.0)
    val rectangle2 = Rectangle(WHITE, 5.0, 10.0)

    val figures = listOf(circle1, circle2, rectangle1, rectangle2)

    val totalBlackPerimeter = figures
        .filter { it.color == BLACK }
        .sumOf { it.perimeter() }

    val totalWhiteArea = figures
        .filter { it.color == WHITE }
        .sumOf { it.area() }

    println("Сумма периметров чёрных фигур: %.2f".format(totalBlackPerimeter))
    println("Сумма площадей белых фигур: %.2f".format(totalWhiteArea))
}