class Address(
    val street: String,
    val city: String,
    val state: String,
    val zipCode: String
) {
    fun displayAddress() {
        println("Address: $street, $city, $state, $zipCode")
    }
}

class Student(
    private val name: String,
    private val className: String,
    private val rollNumber: Int,
    private val marks: Double,
    private val address: Address
) {
    fun calculateGrade(): String {
        return when {
            marks >= 90 -> "A"
            marks >= 80 -> "B"
            marks >= 70 -> "C"
            marks >= 60 -> "D"
            else -> "F"
        }
    }

    fun displayStudentInfo() {
        println("Student Name: $name")
        println("Class: $className")
        println("Roll Number: $rollNumber")
        println("Marks: $marks")
        println("Grade: ${calculateGrade()}")
        address.displayAddress()
    }
}

fun main() {
    println("Enter the student's address details:")
    println("Street:")
    val street = readLine()!!

    println("City:")
    val city = readLine()!!

    println("State:")
    val state = readLine()!!

    println("Zip Code:")
    val zipCode = readLine()!!

    val address = Address(street, city, state, zipCode)

    println("Enter the student's details:")
    println("Name:")
    val name = readLine()!!

    println("Class:")
    val className = readLine()!!

    println("Roll Number:")
    val rollNumber = readLine()!!.toInt()

    println("Marks:")
    val marks = readLine()!!.toDouble()

    val student = Student(name, className, rollNumber, marks, address)

    student.displayStudentInfo()
}
