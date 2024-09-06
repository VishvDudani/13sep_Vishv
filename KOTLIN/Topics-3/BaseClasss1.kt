open class BaseClasss1(val baseProperty1: String) {
    init {
        println("BaseClass constructor called.")
        println("BaseClass property: $baseProperty1")
    }
}
open class IntermediateClasss1(baseProperty1: String, val intermediateProperty1: String) : BaseClasss1(baseProperty1) {
    init {
        println("IntermediateClass constructor called.")
        println("IntermediateClass property: $intermediateProperty1")
    }
}
class DerivedClasss1(baseProperty: String, intermediateProperty: String, val derivedProperty1: String) :
    IntermediateClasss1(baseProperty, intermediateProperty) {
    init {
        println("DerivedClass constructor called.")
        println("DerivedClass property: $derivedProperty1")
    }
}
fun main() {
    val derivedObj = DerivedClasss1("Base Value", "Intermediate Value", "Derived Value")
}
