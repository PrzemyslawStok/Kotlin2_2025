
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
    return 0.0
}

fun main() {

    val a: Int = 10
    val cena = 100.0

    for(i in 1..50) {
        //println("$a+$i= ${add(a,i)}")
        println("netto: $cena, brutto: ${brutto(cena)}")

    }

}