fun main() {
    println("Enter two numbers for multiplication:")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    println("Multiplication of $num1 and $num2 is: ${multiply(num1, num2)}")

    println("Enter a number to find its cubic value:")
    val num3 = readLine()!!.toInt()

    println("Cubic value of $num3 is: ${cubic(num3)}")
}

inline fun multiply(a: Int, b: Int): Int {
    return a * b
}

inline fun cubic(a: Int): Int {
    return a * a * a
}
