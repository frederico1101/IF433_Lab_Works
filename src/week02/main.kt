package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")

    } else {
        println("Masukkan jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}
