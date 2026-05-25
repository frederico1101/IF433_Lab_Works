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