fun add_1(a: Int, b: Int): Int {
    return a + b
}

fun add_2(a: Int, b: Int) = a + b

fun complex_fun(a: Int, b: Int, symbol: Char, f: (Int, Int) -> Int) {
    println("$a $symbol $b = ${f(a, b)}")
}

fun f_power(a: Int, power_no: Int, f: (Int) -> Int) {
    println("$a^$power_no = ${f(a)}")
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

    var f3: (Double) -> (Double) = { x -> x * x }
    f3 = { it * it }

    f_power(2, 3, { it * it * it })
    f_power(3, 5) {
        it * it * it * it * it
    }

    val number_list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    number_list.forEach { println(it * it) }
    val filtered_list = number_list.filter { it % 2 == 0 }
    println(filtered_list)


}