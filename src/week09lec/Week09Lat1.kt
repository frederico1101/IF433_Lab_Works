package week09lec

fun main() {
    println("========== LIST OF IMUT ==========");
    val arSiswa = listOf("Budi", "Danu", "Susi", "Cica");

    //view
    println(arSiswa); //object -> array

    //panjang array
    println("Banyak siswa: " + arSiswa.size);

    //munculin satu orang aja
    println("Siswa bernama ${arSiswa[1]}");

    //munculin semua orang ---> for-each
    for(a in arSiswa) {
        print("Siswa " + a + " dan ");
    }

    println("========== LIST OF MUTABLE =========");
    val arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus");
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);

    println("========== SET OF IMUT ==========");
    val arNilai = setOf(80, 90, 75, 85, 88, 30, 50, 85);
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains(90)}");
    println(arNilai);

    println("========== SET OF MUTABLE =========");
    val arMahasiswa = mutableSetOf("Andi", "Yanto", "Udin", "Yuda");
    arMahasiswa.add("Yanti");
    arMahasiswa.remove("Udin");
    arMahasiswa.add("Udin");
    println(arMahasiswa);

    println("========== MAP IMUT =========");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur asem" to 2500
    );
    println("Banyak menu: ${arResto.size}");
    println("Harga ayam ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("List Harga: ${arResto.values}");
    println(arResto);

    println("========== MAP MUTABLE =========");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92
    arKHS["Cinta"] = 99
    println(arKHS);

}