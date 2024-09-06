class Employee(val name: String, val employeeId: Int, var salary: Double) {

    fun setSalaryBasedOnPerformance(performance: String) {
        when (performance.lowercase()) {
            "excellent" -> {
                salary += salary * 0.20
                println("Performance: Excellent. New Salary: $$salary")
            }
            "good" -> {
                salary += salary * 0.10
                println("Performance: Good. New Salary: $$salary")
            }
            "average" -> {
                salary += salary * 0.05
                println("Performance: Average. New Salary: $$salary")
            }
            "poor" -> {
                println("Performance: Poor. No Salary Increase.")
            }
            else -> {
                println("Invalid performance rating. No Salary Increase.")
            }
        }
    }

    fun displayEmployeeDetails() {
        println("Employee Name: $name")
        println("Employee ID: $employeeId")
        println("Current Salary: $$salary")
    }
}

fun main() {
    println("Enter Employee Name:")
    val name = readLine()!!

    println("Enter Employee ID:")
    val employeeId = readLine()!!.toInt()

    println("Enter Initial Salary:")
    val salary = readLine()!!.toDouble()

    val employee = Employee(name, employeeId, salary)

    employee.displayEmployeeDetails()

    println("Enter Employee Performance (Excellent, Good, Average, Poor):")
    val performance = readLine()!!

    employee.setSalaryBasedOnPerformance(performance)

    employee.displayEmployeeDetails()
}
