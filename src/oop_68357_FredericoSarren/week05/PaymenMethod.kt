package oop_68357_FredericoSarren.week05

abstract class PaymentMethod(

    val accountName: String

) {

    abstract fun processPayment(amount: Double)

}