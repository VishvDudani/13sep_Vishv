fun <T : Comparable<T>> sortArray(array: Array<T>) {
    val n = array.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

fun main() {
    val intArray = arrayOf(5, 3, 8, 1, 2)
    println("Original Integer Array: ${intArray.joinToString()}")
    sortArray(intArray)
    println("Sorted Integer Array: ${intArray.joinToString()}")
}
