fun main() {
    println("Choose a shape to calculate the area:")
    println("1. Triangle")
    println("2. Rectangle")
    println("3. Circle")

    val choice = 2

    if (choice == 1) {

        val base = 10.0
        val height = 5.0
        val area = 0.5 * base * height
        println("The area of the triangle is $area")

    } else if (choice == 2) {

        val length = 8.0
        val width = 6.0
        val area = length * width
        println("The area of the rectangle is $area")

    } else if (choice == 3) {

        val radius = 7.0
        val area = Math.PI * radius * radius
        println("The area of the circle is $area")

    } else {
        println("Invalid choice")
    }
}
