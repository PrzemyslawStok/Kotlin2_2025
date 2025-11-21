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

class Lecture(val name: String, val info: String) {
    override fun toString(): String {
        return name
    }

    fun info(): String {
        return this.name + " : " + this.info
    }


}

class Lecturer(name: String, surname: String) : Person(name, surname) {
    val lectures = mutableListOf<Lecture>()
    override fun toString(): String {
        return super.toString() + ", Lecture: $lectures"
    }

    fun addLecture(name: Lecture) {
        lectures.add(name)
    }
}

fun main() {
    val personList = mutableListOf(Student("Przemysław", "Stokłosa"))

    for (i in 1..10) {
        personList.add(Student("Jan_$i", "Kowalski_$i"))
    }

    val ps = Lecturer("Jan", "Kowalski")
    println(ps)
    ps.addLecture(Lecture("Fizyka", info = "Kolejna lekcja"))
    println(ps)
    ps.addLecture(Lecture("Matematyka", info = "Kolejna lekcja"))
    println(ps)

    val lecture = Lecture("Matematyka", "Kolejna lekcja")
    println(lecture.info())
}