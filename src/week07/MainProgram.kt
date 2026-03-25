package week07

fun main() {
    println("Server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi();

    Mahasiswa.nama="Udin";
    val na: Int= Mahasiswa.set_nilai(uts = 80, uas = 100);
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus("UMN");

    val dsn1 = Dosen("Indah", nik = "12345", tahunMasuk = 2020);
    println(dsn1);
    val dsn2 = dsn1.copy(nama="Budi", nik="32154");
    println(dsn2);
    //cara ambil data satu field aja
    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("Matkul favorit saya: " + MataKuliah.OOP.name);
    println("Index matkul : " + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    //looping munculin semua
    for(matkul in MataKuliah.entries) {
        print("matkul: " + matkul + " ");
        matkul.sks_matkul();
    }
}