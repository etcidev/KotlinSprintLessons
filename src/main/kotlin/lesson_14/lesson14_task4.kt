package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val canLand: Boolean,
    val hasAtmosphere: Boolean,
)

class Planet(
    name: String,
    canLand: Boolean,
    hasAtmosphere: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, canLand, hasAtmosphere)

class Satellite(
    name: String,
    canLand: Boolean,
    hasAtmosphere: Boolean,
) : CelestialBody(name, canLand, hasAtmosphere)

fun main() {
    val satellite1 = Satellite(name = "Харон", canLand = true, hasAtmosphere = false)
    val satellite2 = Satellite(name = "Нокс", canLand = false, hasAtmosphere = false)

    val planet1 = Planet(
        name = "Торманс",
        canLand = true,
        hasAtmosphere = true,
        satellites = listOf(satellite1, satellite2),
    )

    println("Планета ${planet1.name} имеет спутники: ${planet1.satellites.joinToString { it.name }}")
}