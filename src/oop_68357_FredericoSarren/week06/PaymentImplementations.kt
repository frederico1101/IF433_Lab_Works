package oop_68357_FredericoSarren.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay server.") }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount")}
}