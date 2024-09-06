fun findMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val num1 = 10
    val num2 = 20

    val max = findMax(num1, num2)
    println("The maximum of $num1 and $num2 is: $max")
}
