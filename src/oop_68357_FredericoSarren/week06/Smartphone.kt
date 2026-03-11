package oop_68357_FredericoSarren.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem Operasi Smartphone berhasil Booting.")
    }

}