class Triangle {
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    fun setSides(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    fun isEquilateral(): Boolean {
        return (side1 == side2 && side2 == side3)
    }

    fun isIsosceles(): Boolean {
        return (side1 == side2 || side2 == side3 || side1 == side3)
    }

    fun isScalene(): Boolean {
        return (side1 != side2 && side2 != side3 && side1 != side3)
    }

    fun displayTriangleType() {
        when {
            isEquilateral() -> println("The triangle is Equilateral.")
            isIsosceles() -> println("The triangle is Isosceles.")
            isScalene() -> println("The triangle is Scalene.")
            else -> println("Invalid triangle.")
        }
    }
}

fun main() {
    val triangle = Triangle()

    println("Enter the lengths of the three sides of the triangle:")
    val side1 = readLine()!!.toDouble()
    val side2 = readLine()!!.toDouble()
    val side3 = readLine()!!.toDouble()

    triangle.setSides(side1, side2, side3)

    triangle.displayTriangleType()
}
