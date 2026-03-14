package oop_68357_FredericoSarren.week05

class MathHelper {

    // luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }

}