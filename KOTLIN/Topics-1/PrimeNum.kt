fun main() {
    val number = 17
    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}
