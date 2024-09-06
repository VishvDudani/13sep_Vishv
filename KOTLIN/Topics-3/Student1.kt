open class Student1{
    var name: String = ""
    var rollNo: Int = 0

    open fun inputStudentData() {
        print("Enter Student Name: ")
        name = readLine().toString()
        print("Enter Roll Number: ")
        rollNo = readLine()?.toInt() ?: 0
    }

    open fun displayStudentData() {
        println("Student Name: $name")
        println("Roll Number: $rollNo")
    }
}

interface Marks1 {
    var subject1Marks: Int
    var subject2Marks: Int

    fun inputMarks1() {
        print("Enter Marks for Subject 1: ")
        subject1Marks = readLine()?.toInt() ?: 0
        print("Enter Marks for Subject 2: ")
        subject2Marks = readLine()?.toInt() ?: 0
    }

    fun displayMarks1() {
        println("Marks for Subject 1: $subject1Marks")
        println("Marks for Subject 2: $subject2Marks")
    }
}

interface Marks2 {
    var subject3Marks: Int
    var subject4Marks: Int

    fun inputMarks2() {
        print("Enter Marks for Subject 3: ")
        subject3Marks = readLine()?.toInt() ?: 0
        print("Enter Marks for Subject 4: ")
        subject4Marks = readLine()?.toInt() ?: 0
    }

    fun displayMarks2() {
        println("Marks for Subject 3: $subject3Marks")
        println("Marks for Subject 4: $subject4Marks")
    }
}

class Marksheet : Student1(), Marks1, Marks2 {
    override var subject1Marks: Int = 0
    override var subject2Marks: Int = 0
    override var subject3Marks: Int = 0
    override var subject4Marks: Int = 0

    fun inputAndDisplayMarksheet() {
        inputStudentData()
        inputMarks1()
        inputMarks2()
        displayMarksheet()
    }

    fun displayMarksheet() {
        println("\n---- Marksheet ----")
        displayStudentData()
        displayMarks1()
        displayMarks2()
        println("-------------------")
        println("Total Marks: ${subject1Marks + subject2Marks + subject3Marks + subject4Marks}")
    }
}

fun main() {
    val marksheet = Marksheet()
    marksheet.inputAndDisplayMarksheet()
}
