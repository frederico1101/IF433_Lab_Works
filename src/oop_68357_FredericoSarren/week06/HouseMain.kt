package oop_68357_FredericoSarren.week06

fun main() {

    val lamp = SmartLamp("L01", "Ruang Tamu")

    val speaker = SmartSpeaker(
        "S01",
        "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        "C01",
        "Ezviz Garasi"
    )

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== SECURITY MODE ===")
    hub.activateSecurityMode()

    println("\n=== MATIKAN SEMUA DEVICE ===")
    hub.turnOffAllSwitches()
}