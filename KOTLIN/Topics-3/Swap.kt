fun swap(a: Int, b: Int) {
    println("Before Swap: a = $a, b = $b")

    var x = a
    var y = b
    x = x + y
    y = x - y
    x = x - y

    println("After Swap: a = $x, b = $y")
}

fun main() {
    val a = 10
    val b = 20

    swap(a, b)
}
