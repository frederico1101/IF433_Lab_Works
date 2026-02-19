package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    println("Pilih Jalur Pendaftaran:")
    println("1. Daftar dengan Jurusan")
    println("2. Daftar tanpa Jurusan (Non-Matriculated)")
    print("Masukkan pilihan (1/2): ")

    val pilihan = scanner.nextInt()
    scanner.nextLine() // clear buffer

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        when (pilihan) {

            1 -> {
                println("Masukkan Jurusan: ")
                val major = scanner.nextLine()

                println("Masukkan IPK: ")
                val gpa = scanner.nextDouble()

                val s1 = Student(name, nim, major, gpa)
                println("Status: Pendaftaran Selesai")
            }

            2 -> {
                val s1 = Student(name, nim)
                println("Status: Pendaftaran Selesai (Non-Matriculated)")
            }

            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    scanner.close()
}
