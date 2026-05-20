package week13lec

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Mahasiswa(val nim: String, val nama: String, val nilai: Int) {
    fun simpanDanConvertCSV(): String {
        return "$nim,$nama,$nilai"
    }
}

fun main(){
    println("\n=== Cara2 - Buat File ===")
    //satuan
    val mhs = Mahasiswa("111", "Christopher", 84)
    //banyak
    val listMhs:List<Mahasiswa> = listOf(
        Mahasiswa("111", "Andhika", 86),
        Mahasiswa("222", "Wilbert", 83),
        Mahasiswa("333", "Yoga", 84),
    )
    //simpan ke file CSV
    val file5 = File("src/week13lec/data_rahasia_mahasiswa.csv");
    file5.writeText(listMhs.joinToString("\n"){
        it.simpanDanConvertCSV()
    });

    println("\n=== Cara1 - Baca isi File ===")
    val file1 = File("src/week13lec/contohfile.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println("\n=== Cara2 - Baca isi File ===")
    val contentSaya = file1.readLines();
    contentSaya.forEach {
        println(it)
    }

    println("\n=== Cara3 - Baca isi File - BUFFERED READER ===")
    val file2 = BufferedReader(FileReader("src/week13lec/contohfile.txt"))
    var isiFile:String? = file2.readLine();
    while (isiFile != null) {
        println(isiFile);
        isiFile = file2.readLine()
    }
    file2.close()

    println("\n=== Cara4 - Baca isi File - BUFFERED READER (ver.USE) ===")
    val file3 = File("src/week13lec/contohfile.txt").bufferedReader()
    file3.use {
        it.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }

    println("\n=== Cara1 - Buat File ===")
    val fileSaya = File("src/week13lec/fileDataSaya.txt");
    fileSaya.writeText("Saya suka ke pasar\nBeli buah dan sayuran");

    fileSaya.appendText("\nuntuk ayah dan ibu\ndan kakak adik");

    val listBelanjaan = listOf("ayam", "pisang", "beras");
    fileSaya.appendText("\n" + listBelanjaan.joinToString("\n"));

    //ini akan menimpa isi file sebelumnya
    fileSaya.printWriter().use{
        it.println("Saya kuliah di UMN")
        it.println("UMN kampus keren")
        it.println("Saya jurusan IF")
    }
}