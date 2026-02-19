package week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    println("\nBattle Dimulai! Musuh memiliki 100 HP.\n")

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {

            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage

                if (enemyHp < 0) enemyHp = 0

                println("HP Musuh sekarang: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas menyerang sebesar $enemyDamage!")

                    hero.takeDamage(enemyDamage)
                    println("HP ${hero.name} sekarang: ${hero.hp}")
                }
                println()
            }

            2 -> {
                println("${hero.name} memilih kabur dari pertarungan!")
                break
            }

            else -> println("Pilihan tidak valid!\n")
        }
    }

    println("=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH...")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }

    scanner.close()
}
