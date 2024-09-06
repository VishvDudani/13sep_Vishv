class Car {
    private var company: String = ""
    private var model: String = ""
    private var year: Int = 0

    fun setCompany(company: String) {
        this.company = company
    }

    fun getCompany(): String {
        return company
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun getModel(): String {
        return model
    }

    fun setYear(year: Int) {
        this.year = year
    }

    fun getYear(): Int {
        return year
    }
}

fun main() {
    val car = Car()

    car.setCompany("Toyota")
    car.setModel("Corolla")
    car.setYear(2021)

    println("Car Company: ${car.getCompany()}")
    println("Car Model: ${car.getModel()}")
    println("Car Year: ${car.getYear()}")
}
