package oop_68357_FredericoSarren.week14

import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(
    private val file: File = File("orders.csv")
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

class BetterOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

fun main() {

    val processor = BetterOrderProcessor(
        repo = CsvOrderRepository(),
        notifier = EmailNotifier()
    )

    processor.processOrder(
        itemName = "Keyboard Gaming",
        basePrice = 350000.0,
        customerType = "VIP",
        pricingStrategy = VipPricing()
    )
}