package week14LEC

class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz*0.3) + (tugasHarian*0.7)
    }
    fun hitung_NA(uts:Double, uas: Double, tugas: Double, jamanPilih: Bobot_persen_jaman): Double {
        return jamanPilih.bobot_nilai_jaman(uts, uas, tugas);
    }
}

//OCP
interface Bobot_persen_jaman {
    fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double) : Double
}
class JamanCovid: Bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.3) + (tugas * 0.4);
    }
}
class JamanNewNormal: Bobot_persen_jaman {
        override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double {
            return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
        }
}

class simpan_khs {
    fun simpan_nilai_db(nim: String, nama: String, nilaiAkhir: Double) {
        println("Data si $nim $nama dengan nilai $nilaiAkhir disimpan");
    }
    fun load_nilai_db(nim: String ) {
        println("berikut data mahasiswa dengan nim $nim");
    }
}

class Manager_KHS_mhs {
    fun hitung_khs_mhs(quizMHS: Double, tugasHarianMHS: Double, utsMHS: Double, uasMHS: Double) : Double {
        val khsMhs = khs_mahasiswa();
        val rataTugas: Double = khsMhs.hitung_tugas(quizMHS,tugasHarianMHS);
        return khsMhs.hitung_NA(utsMHS,uasMHS, rataTugas, JamanNewNormal() );
    }
}

class DB_KHS_mhs {
    fun SaveKHSMHS(nim:String, nama:String, nilai: Double) {
        println("Mahasiswa dengan nim $nim $nama nilainya $nilai Berhasil SIMPAN")
    }
}

fun main() {
    val angKHS = Manager_KHS_mhs();
    val NAMhs1 = angKHS.hitung_khs_mhs(80.50, 70.54, 85.70,81.36);
    val NAMhs2 = angKHS.hitung_khs_mhs(81.50, 73.14, 81.70,71.36);

    val dbBaruMHS = DB_KHS_mhs();
    dbBaruMHS.SaveKHSMHS("123", "Yanto", NAMhs1);
    dbBaruMHS.SaveKHSMHS("231", "Siska", NAMhs2);
}
