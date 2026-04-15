package oop_68357_FredericoSarren.week08lec

class set_krs(val nim:String, val kodematkul: String?) {
    fun matkul_wajib(sks: Int?) {
        println("Matkul kamu $kodematkul sksnya adalah $sks");
    }
}

fun main() {
    var nama: String? = "Wirawan";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs(nim = "123", kodematkul = null);
    println("NIM kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null);

}