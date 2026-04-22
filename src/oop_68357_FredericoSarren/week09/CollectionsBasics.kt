package oop_68357_FredericoSarren.week09

fun main() {

    println("=== TEST LIST ===")

    val frameworks: List<String> = listOf("Korlin", "Java", "C++")

    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0]= 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("unique Numbers (Set): $uniqueNumbers")

    val activesUsers = mutableSetOf("UserA", "UserB")
    activesUsers.add( "UserC")
    activesUsers.add( "UserA")
    println("Active Users: $activesUsers")

}