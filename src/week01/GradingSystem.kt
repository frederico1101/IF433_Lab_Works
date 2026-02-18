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

    //Tambahkan di akhir main()
    val studentId: String? = null

    //Jika Null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

//Tulis di luar main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"