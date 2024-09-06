fun main() {
    val number = 5
    var factorial = 1

    for (i in 1..number) {
        factorial *= i
    }

    println("The factorial of $number is $factorial")
}
