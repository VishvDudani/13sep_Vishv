fun main() {
    val number = 97475
    var tempNumber = number
    var sumOfDigits = 0

    while (tempNumber != 0) {
        val digit = tempNumber % 10
        sumOfDigits += digit
        tempNumber /= 10
    }

    println("The sum of the digits in $number is $sumOfDigits")
}
