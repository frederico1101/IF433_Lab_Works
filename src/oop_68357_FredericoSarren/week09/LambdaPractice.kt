package oop_68357_FredericoSarren.week09

fun main() {
    println("=== TEST LAMBDA ===")

    val sumLamda = {a: Int, b: Int -> a + b}
    println("Hasil sum: ${sumLamda(5,10)}")

    val squareImplicit: (Int) -> Int = {it *it}
    println("Hasil Square: ${squareImplicit(4)}")
}