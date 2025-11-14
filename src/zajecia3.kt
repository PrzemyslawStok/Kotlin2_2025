open class Person(val name: String, val surname: String, val age: Int = 10, val zipCode: Int = 43300) {
    override fun toString(): String {
        return "Name: $name, Surname: $surname, Age: $age , ZipCode: $zipCode"
    }

    fun printInfo() {
        println(this)
    }
}

class Student(name: String, surname: String, idNumber: Int=10) : Person(name, surname) {

}

fun main() {
    val personList = mutableListOf(Student("Przemysław", "Stokłosa"))

    for (i in 1..10) {
        personList.add(Student("Jan_$i", "Kowalski_$i", i + 10))
    }
    println(personList)
}