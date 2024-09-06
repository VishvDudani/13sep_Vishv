class MathOperations {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun divide(a: Double, b: Double): Double {
        return a / b
    }
}

fun main() {
    val mathOps = MathOperations()

    println("Integer Operations:")
    println("Addition: ${mathOps.add(10, 5)}")
    println("Subtraction: ${mathOps.subtract(10, 5)}")
    println("Multiplication: ${mathOps.multiply(10, 5)}")
    println("Division: ${mathOps.divide(10, 5)}")

    println("\nDouble Operations:")
    println("Addition: ${mathOps.add(10.5, 5.5)}")
    println("Subtraction: ${mathOps.subtract(10.5, 5.5)}")
    println("Multiplication: ${mathOps.multiply(10.5, 5.5)}")
    println("Division: ${mathOps.divide(10.5, 5.5)}")
}
