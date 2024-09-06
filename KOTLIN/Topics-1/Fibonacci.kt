fun main() {
    val number = 10
    var first = 0
    var second = 1

    println("Fibonacci series up to $number terms: ")

    for (i in 1..number) {
        print("$first ")

        val next = first + second
        first = second
        second = next
    }
}
