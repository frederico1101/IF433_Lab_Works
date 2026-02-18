package week03

fun main() {
    val e = Employee( "Budi")

    //1. Test validasi salary
    e.salary = -1000 // harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    //e.performancerating = 5 // coba uncomment, pasti marah(Error)

    //3. test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}