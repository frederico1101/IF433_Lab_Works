package oop_68357_FredericoSarren.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 25, -12.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 3.4, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, -2.0, "OPEN")
    )

    //pipeline 1
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

   //pipeline 2
    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    //pipeline 3
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

   //pipeline 4
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    //pipeline 5
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }



}