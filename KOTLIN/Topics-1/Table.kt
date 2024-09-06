fun main() {
    val number = 5

    println("Multiplication table of $number:")

    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
