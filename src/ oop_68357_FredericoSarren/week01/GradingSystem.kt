package oop_68357_FredericoSarren.week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name: String = "frederico"
    val score: Int = 80

    // REFACTOR: String template ($name)
    println("Nama: $name, Nilai: $score")

    //Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    //Panggil di dalam Main()
    println("Status: ${calculateStatus(score)}")
}

//Tulis di luar main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"