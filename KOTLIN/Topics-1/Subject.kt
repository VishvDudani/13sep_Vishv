fun main() {
    val subject1 = 85.0
    val subject2 = 90.0
    val subject3 = 78.0
    val subject4 = 88.0
    val subject5 = 92.0

    val totalMarks = subject1 + subject2 + subject3 + subject4 + subject5

    val totalPossibleMarks = 5 * 100.0

    val percentage = (totalMarks / totalPossibleMarks) * 100

    println("Total marks obtained: $totalMarks")

    println("Percentage: $percentage%")
}
