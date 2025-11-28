fun add_1(a: Int, b: Int): Int {
    return a + b
}

fun add_2(a: Int, b: Int) = a + b

fun complex_fun(a: Int, b: Int, symbol: Char, f: (Int, Int) -> Int) {
    println("$a $symbol $b = ${f(a, b)}")
}

fun main() {
    val a = 10
    val b = 20
    println("$a + $b = ${add_1(a, b)}")
    println("$a + $b = ${add_2(a, b)}")

    var f0: (Double) -> Int
    var f1: (Int, Int) -> Int = { x, y -> x + y }

    println("f1($a, $b) = ${f1(a, b)}")

    f1 = { x: Int, y: Int -> x * y }

    println("f1($a, $b) = ${f1(a, b)} ")

    var f2: (Double, Double, Double) -> Double = { x, y, z -> x * y * z }

    complex_fun(a, b, '+', { a: Int, b: Int -> a + b })
    complex_fun(a, b, '*', { a: Int, b: Int -> a * b })
    complex_fun(a, b, '⇒', { a: Int, b: Int -> 2 * a * b })

}