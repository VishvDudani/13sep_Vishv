fun main() {
    val number = 12345
    var reversedNumber = 0
    var tempNumber = number

    while (tempNumber != 0) {
        val digit = tempNumber % 10
        reversedNumber = reversedNumber * 10 + digit
        tempNumber /= 10
    }

    println("The reverse of $number is $reversedNumber")
}