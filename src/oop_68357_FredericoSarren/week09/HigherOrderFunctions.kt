package oop_68357_FredericoSarren.week09

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("Original Data: $numbers")
    println("\n=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("Evens Only: $evens")

    println("\n=== HOF: MAP ===")

    val multiplied = evens.map { it * 10}
    val asString = multiplied.map { "Rp ${it}k"}
    println("Multiplied: $multiplied")
    println("Formated: $asString")
}