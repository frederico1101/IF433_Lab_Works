package oop_68357_FredericoSarren.week08lec

class Alamat(val nomor:Int, val kota: String);
class Mahasiswa(val nim: String, val addr: Alamat? );

fun main() {
    val almt = Alamat (nomor = 47 , kota = "Tangerang");
    val mhs = Mahasiswa(nim = "12345", addr = almt);

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> "sini nih...  ${mhs.addr.kota} nomornya ${mhs.addr.nomor}";
    }?:"Gak jelas, ga tau dimana";

    println("NIM-nya ${mhs.nim} tinggalnya di ${defaultAlamat}");
}