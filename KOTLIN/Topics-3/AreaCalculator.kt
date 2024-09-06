class AreaCalculator {

    fun calculateArea(length: Double, breadth: Double): Double {
        return length * breadth
    }

    fun calculateArea(base: Double, height: Double, isTriangle: Boolean): Double {
        return if (isTriangle) 0.5 * base * height else 0.0
    }

    fun calculateArea(radius: Double): Double {
        return 3.14 * radius * radius
    }
}

fun main() {
    val areaCalc = AreaCalculator()

    val rectangleArea = areaCalc.calculateArea(10.0, 5.0)
    println("Area of Rectangle: $rectangleArea")

    val triangleArea = areaCalc.calculateArea(10.0, 5.0, true)
    println("Area of Triangle: $triangleArea")

    val circleArea = areaCalc.calculateArea(7.0)
    println("Area of Circle: $circleArea")
}
