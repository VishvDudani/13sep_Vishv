class Calculator(val num1: Double, val num2: Double) {

    fun add(): Double {
        return num1 + num2
    }

    fun subtract(): Double {
        return num1 - num2
    }

    fun multiply(): Double {
        return num1 * num2
    }

    fun divide(): Double {
        if (num2 != 0.0) {
            return num1 / num2
        } else {
            println("Division by zero is not allowed.")
            return 0.0
        }
    }
}

fun main() {
    println("Enter the first number:")
    val num1 = readLine()!!.toDouble()

    println("Enter the second number:")
    val num2 = readLine()!!.toDouble()

    val calculator = Calculator(num1, num2)

    println("Addition: ${calculator.add()}")
    println("Subtraction: ${calculator.subtract()}")
    println("Multiplication: ${calculator.multiply()}")
    println("Division: ${calculator.divide()}")
}
