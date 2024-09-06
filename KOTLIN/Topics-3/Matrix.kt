class Matrix(private val elements: IntArray) {

    operator fun plus(other: Matrix): Matrix {
        if (this.elements.size != other.elements.size) {
            throw IllegalArgumentException("Matrices must have the same size for addition")
        }

        val result = IntArray(this.elements.size)
        for (i in elements.indices) {
            result[i] = this.elements[i] + other.elements[i]
        }
        return Matrix(result)
    }

    fun display() {
        println(elements.joinToString(", "))
    }
}

fun main() {
    val matrix1 = Matrix(intArrayOf(1, 2, 3, 4))
    val matrix2 = Matrix(intArrayOf(5, 6, 7, 8))

    println("Matrix 1:")
    matrix1.display()

    println("Matrix 2:")
    matrix2.display()

    val resultMatrix = matrix1 + matrix2

    println("Resultant Matrix (Matrix1 + Matrix2):")
    resultMatrix.display()
}
