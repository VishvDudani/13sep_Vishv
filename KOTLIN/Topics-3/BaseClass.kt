open class BaseClass {
    private val privateVar = "Private Variable"
    protected val protectedVar = "Protected Variable"
    public val publicVar = "Public Variable"

    fun showBaseClass() {
        println("Inside BaseClass:")
        println(privateVar)
        println(protectedVar)
        println(publicVar)
    }
}

class DerivedClass : BaseClass() {
    fun showDerivedClass() {
        println("Inside DerivedClass:")
        println(protectedVar)
        println(publicVar)
    }
}

fun main() {
    val base = BaseClass()
    base.showBaseClass()
    println(base.publicVar)

    val derived = DerivedClass()
    derived.showDerivedClass()
}
