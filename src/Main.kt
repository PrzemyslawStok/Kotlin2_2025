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

fun brutto(a: Double): Double {
    return a * (1.0 + 0.23)
}

fun main() {

    var cena = 0.0

    for (i in 1..50) {
        cena = Random.nextInt(1000,5000).toDouble()
        println("netto: $cena, brutto: ${brutto(cena)}")

    }

}