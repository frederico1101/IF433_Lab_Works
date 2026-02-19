package week02

class Student(
    val name: String,
    var nim: String,
    var major: String
) {

    init {
        // cek panjang nim
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }

    //Secondary constructor
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan) .")
    }
}
