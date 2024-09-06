open class Cricketer {
    var name: String = ""
    var age: Int = 0

    open fun inputData() {
        print("Enter Cricketer's Name: ")
        name = readLine().toString()
        print("Enter Cricketer's Age: ")
        age = readLine()?.toInt() ?: 0
    }

    open fun displayData() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Batsman : Cricketer() {
    var totalRuns: Int = 0
    var averageRuns: Double = 0.0
    var bestPerformance: Int = 0

    override fun inputData() {
        super.inputData()
        print("Enter Total Runs: ")
        totalRuns = readLine()?.toInt() ?: 0
        print("Enter Best Performance: ")
        bestPerformance = readLine()?.toInt() ?: 0
        calculateAverage()
    }
    fun calculateAverage() {
        if (totalRuns > 0) {
            averageRuns = totalRuns.toDouble() / 10
        }
    }
    override fun displayData() {
        super.displayData()
        println("Total Runs: $totalRuns")
        println("Best Performance: $bestPerformance")
        println("Average Runs: $averageRuns")
    }
}
fun main() {
    val batsman = Batsman()
    batsman.inputData()
    println("\nDisplaying Batsman Data:")
    batsman.displayData()
}
