fun <T> swapValues(a: T, b: T) {
    var first = a
    var second = b

    println("Before Swap: first = $first, second = $second")

    first = second.also { second = first }

    println("After Swap: first = $first, second = $second")
}

fun main() {

    swapValues("Hello", "World")

    swapValues(10.5, 20.5)
}
