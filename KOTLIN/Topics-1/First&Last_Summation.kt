fun main() {
    val number = 8765
    var tempNumber = number

    val lastDigit = tempNumber % 10

    var firstDigit = tempNumber
    while (firstDigit >= 10) {
        firstDigit /= 10
    }

    val sum = firstDigit + lastDigit

    println("The sum of the first and last digits in $number is $sum")
}
