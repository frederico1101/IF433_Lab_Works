package oop_68357_FredericoSarren.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN : ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    val math = MathHelper()

    println("Luas Persegi: " + math.hitungLuas(5))

    println("Luas Persegi Panjang: " + math.hitungLuas(6,4))

    println("Luas Lingkaran: " + math.hitungLuas(7.0))

    println("\n--- Payment System Test ---")

    val wallet = EWallet("Frederico",50000.0)

    val creditCard = CreditCard("Frederico",100000.0)

    val paymentMethods : List<PaymentMethod> = listOf(wallet,creditCard)

    for(method in paymentMethods){

        method.processPayment(75000.0)

        if(method is EWallet){

            method.topUp(50000.0)

            method.processPayment(75000.0)

        }

    }
}