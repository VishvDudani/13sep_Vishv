open class Students(val rollNumber: Int)

open class Test(rollNumber: Int, val subject1Marks: Int, val subject2Marks: Int) : Students(rollNumber) {
    fun totalMarks(): Int {
        return subject1Marks + subject2Marks
    }
}

class Result(rollNumber: Int, subject1Marks: Int, subject2Marks: Int) : Test(rollNumber, subject1Marks, subject2Marks) {
    fun displayResult() {
        println("Roll Number: $rollNumber")
        println("Marks in Subject 1: $subject1Marks")
        println("Marks in Subject 2: $subject2Marks")
        println("Total Marks: ${totalMarks()}")
    }
}

fun main() {
    val studentResult = Result(101, 85, 90)
    studentResult.displayResult()
}
