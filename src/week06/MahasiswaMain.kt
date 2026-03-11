package week06

fun main() {
    val mhs = Mahasiswa(
        "HMIF",
        budgetRapat = 15000,
        jmlOrg = 20,
        namaMk = "OOP",
        nilaiMk = 89)
    mhs.rapat();
    mhs.penilaian();
    mhs.keaktifan();
}
