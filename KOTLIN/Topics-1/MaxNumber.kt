fun main() {
    val number = 43567
    var tempNumber = number
    var maxDigit = 0

    while (tempNumber != 0) {
        val digit = tempNumber % 10
        if (digit > maxDigit) {
            maxDigit = digit
        }
        tempNumber /= 10
    }

    println("The maximum digit in $number is $maxDigit")
}
