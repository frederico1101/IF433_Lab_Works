package week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("--- SISTEM DENDA PERPUSTAKAAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        println("Durasi tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // Membuat objek Loan
    val loan = Loan(bookTitle, borrower, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku     : ${loan.bookTitle}")
    println("Peminjam       : ${loan.borrower}")
    println("Lama Pinjam    : ${loan.loanDuration} hari")
    println("Total Denda    : Rp ${loan.calculateFine()}")

    scanner.close()
}
