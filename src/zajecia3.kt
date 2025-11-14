class Person(val name: String, val surname: String, val age: Int = 10) {
    fun printInfo() {
        println("Name: $name, Surname: $surname, Age: $age")
    }
}

fun main() {
    val personList = mutableListOf(Person("Przemysław", "Stokłosa"))

    for (i in 1..10) {
        personList.add(Person("Jan_$i", "Kowalski_$i", i + 10))
    }
    println(personList)

    for(person in personList) {
        person.printInfo()
    }
}