package oop_68357_FredericoSarren.week12

class InsufficientFundsException(
    val amount : Double,
    val balance : Double
) : Exception("Attempted $amount, balance: $balance")