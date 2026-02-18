package week03

fun main() {

    println("=== WEAPON TEST ===")

    val sword = Weapon("Dragon Slayer")

    sword.damage = -50      // Harus gagal
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999     // Harus jadi 1000
    println("Damage sekarang: ${sword.damage}")

    println("Tier weapon: ${sword.tier}")

    println("\n=== PLAYER TEST ===")

    val player = Player("Rico")

// println(player.xp)  // <-- Ini harus ERROR (private)

    player.addXp(50)   // Masih level 1
    println("Level sekarang: ${player.level}")

    player.addXp(60)   // Total 110 → Level 2
    println("Level sekarang: ${player.level}")

}
