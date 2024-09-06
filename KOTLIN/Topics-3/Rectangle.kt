open class Shape {
    var length: Double = 0.0
    var width: Double = 0.0

    open fun inputDimensions() {
        print("Enter Length: ")
        length = readLine()?.toDouble() ?: 0.0
        print("Enter Width: ")
        width = readLine()?.toDouble() ?: 0.0
    }
}

class Rectangle : Shape() {

    fun calculateArea(): Double {
        return length * width
    }

    fun displayArea() {
        val area = calculateArea()
        println("Area of the Rectangle: $area")
    }
}

fun main() {
    val rectangle = Rectangle()
    rectangle.inputDimensions()
    rectangle.displayArea()
}
