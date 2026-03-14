package oop_68357_FredericoSarren.week05

class CreditCard(

    accountName: String,
    val limit: Double

) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if(usedAmount + amount <= limit){

            usedAmount += amount

            println("$accountName berhasil membayar Rp$amount dengan Credit Card")

        }
        else{

            println("Transaksi ditolak. Melebihi limit.")

        }

    }

}