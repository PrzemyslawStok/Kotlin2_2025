open class Person(val name: String, val surname: String, val age: Int = 10, val zipCode: Int = 43300) {
    override fun toString(): String {
        return "Name: $name, Surname: $surname, Age: $age , ZipCode: $zipCode"
    }

    fun printInfo() {
        println(this)
    }
}

class Student(name: String, surname: String, val idNumber: Int = 10) : Person(name, surname) {
    override fun toString(): String {
        return super.toString() + ", Id: $idNumber"
    }
}

class Lecturer(name: String, surname: String, val l_name: String) : Person(name, surname) {

}

fun main() {
    val personList = mutableListOf(Student("Przemysław", "Stokłosa"))

    for (i in 1..10) {
        personList.add(Student("Jan_$i", "Kowalski_$i"))
    }
    println(personList)

    val ps = Lecturer("Jan", "Kowalski", "Lecturer")
    println(ps)
}