open class Person {
    var name: String = ""
    var age: Int = 0

    open fun inputData() {
        print("Enter Name: ")
        name = readLine().toString()
        print("Enter Age: ")
        age = readLine()?.toInt() ?: 0
    }

    open fun displayData() {
        println("Name: $name")
        println("Age: $age")
    }
}

interface StudentInterface {
    var percentage: Double

    fun inputStudentData() {
        print("Enter Percentage: ")
        percentage = readLine()?.toDouble() ?: 0.0
    }

    fun displayStudentData() {
        println("Percentage: $percentage")
    }
}

interface TeacherInterface {
    var salary: Double

    fun inputTeacherData() {
        print("Enter Salary: ")
        salary = readLine()?.toDouble() ?: 0.0
    }

    fun displayTeacherData() {
        println("Salary: $salary")
    }
}

class Student : Person(), StudentInterface {
    override var percentage: Double = 0.0

    fun inputAndDisplayStudent() {
        inputData()
        inputStudentData()
    }

    fun displayStudent() {
        displayData()
        displayStudentData()
    }
}

class Teacher : Person(), TeacherInterface {
    override var salary: Double = 0.0

    fun inputAndDisplayTeacher() {
        inputData()
        inputTeacherData()
    }

    fun displayTeacher() {
        displayData()
        displayTeacherData()
    }
}

fun main() {
    println("Enter details for a student:")
    val student = Student()
    student.inputAndDisplayStudent()
    println("\nDisplaying Student Data:")
    student.displayStudent()

    println("\nEnter details for a teacher:")
    val teacher = Teacher()
    teacher.inputAndDisplayTeacher()
    println("\nDisplaying Teacher Data:")
    teacher.displayTeacher()
}
