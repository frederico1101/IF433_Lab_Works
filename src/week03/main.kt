package week03

fun main() {

    println("=== WEAPON TEST ===")

    val sword = Weapon("Dragon Slayer")

    sword.damage = -50      // Harus gagal
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999     // Harus jadi 1000
    println("Damage sekarang: ${sword.damage}")

    println("Tier weapon: ${sword.tier}")
}
