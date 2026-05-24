package oop_68357_FredericoSarren.week14

interface DiscountStrategy {
    fun apply (price: Double): Double
}

class StudentDiscount {
    override fun apply(price: Double) = price * 0.80
}

class MemberDiscount {
    override fun apply(price: Double) = price * 0.85
}

class SafeDiscountCalculator (private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}

class SeniorDiscount {
    override fun apply(price: Double) = price * 0.75
}