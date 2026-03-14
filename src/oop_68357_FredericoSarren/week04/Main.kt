package oop_68357_FredericoSarren.week04

import oop_68357_frederico.week04.ElectricCar

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 100
    )

    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager(
        name = "Andi",
        baseSalary = 10000000
    )

    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println()

    val developer = Developer(
        name = "Budi",
        baseSalary = 8000000,
        programmingLanguage = "Kotlin"
    )

    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}