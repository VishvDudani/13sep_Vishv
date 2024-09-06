class MyString(private val str: String) {

    operator fun plus(other: MyString): MyString {
        return MyString(this.str + other.str)
    }

    fun display() {
        println(str)
    }
}

fun main() {
    val string1 = MyString("Hello, ")
    val string2 = MyString("World!")

    val resultString = string1 + string2

    println("Concatenated String:")
    resultString.display()
}
