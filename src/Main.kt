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

fun f_brutto() {
    var cena = 0.0
    val vat = 0.23

    for (i in 1..50) {
        cena = Random.nextInt(1000, 5000).toDouble()
        println("netto: $cena, brutto: ${brutto(cena, 0.1)}")

    }
}

fun distance(t: Double, a: Double = 9.81): Double {
    return a * t * t / 2
}

fun main() {
//    f_brutto()
    val names = listOf(
        "Słońce",
        "Merkury",
        "Wenus",
        "Ziemia",
        "Księżyc",
        "Mars",
        "Jowisz",
        "Saturn",
        "Uran",
        "Neptun",
        "Pluton"
    )

    val accelerations = listOf(
        274.0,   // Słońce
        3.7,     // Merkury
        8.87,    // Wenus
        9.81,    // Ziemia
        1.62,    // Księżyc
        3.71,    // Mars
        24.79,   // Jowisz
        10.44,   // Saturn
        8.87,    // Uran
        11.15,   // Neptun
        0.62     // Pluton
    )
    var t = 2.5
    println("droga: ${distance(t)}")

    for (i in 0..<names.size) {
        println("Ciało niebieskie: ${names[i]} posiada przyspieszenie grawitacyjne: ")
    }

    t = 10.0
    println("Na ziemi ciało po upływie 10s przebędzie odległość: ")

    println(names)
    println(accelerations)

}