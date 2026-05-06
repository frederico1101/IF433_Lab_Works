package oop_68357_FredericoSarren.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let{
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTIONS ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}