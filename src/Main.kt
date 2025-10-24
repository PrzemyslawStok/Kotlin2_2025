import kotlin.random.Random

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun div(a: Int, b: Int): Int {
    return a / b
}

fun brutto(number: Double, vat: Double = 0.23): Double {
    return number * (1.0 + vat)
}

fun f_brutto(){
    var cena = 0.0
    val vat = 0.23

    for (i in 1..50) {
        cena = Random.nextInt(1000, 5000).toDouble()
        println("netto: $cena, brutto: ${brutto(cena, 0.1)}")

    }
}

fun x(t: Double,a: Double): Double {
    return a*t*t/2
}

fun main() {
//    f_brutto()


}