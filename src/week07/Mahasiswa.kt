package week07

class Mahasiswa private constructor(val kampus: String) {
    companion object {
        var nama:String = "unknown";

        fun set_nilai(uts:Int, uas:Int): Int {
            return (uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv:String){
            Mahasiswa(kampus = namaUniv);
        }
    }
    //bagian yang class biasa (Bukan Companion Object)
    init {
        println("nama kampus kamu $kampus");
    }
}