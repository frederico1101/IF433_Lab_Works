package week06

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMk: String,
    override val nilaiMk: Int
) : Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namaOrg");
        println("Biaya konsum rapat: ${super.biayaKonsumsi}");
    }

    override fun penilaian() {
        println("Nilai $namaMk adalah $nilaiMk");
    }

    override fun keaktifan() {
        super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }
}