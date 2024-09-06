class Date {
    private var day: Int = 0
    private var month: Int = 0
    private var year: Int = 0

    fun setDate(day: Int, month: Int, year: Int) {
        this.day = day
        this.month = month
        this.year = year
    }

    fun getDay(): Int {
        return day
    }

    fun getMonth(): Int {
        return month
    }

    fun getYear(): Int {
        return year
    }

    fun isValidDate(): Boolean {
        if (month !in 1..12) return false

        val daysInMonth = when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if (isLeapYear(year)) 29 else 28
            else -> 0
        }

        return day in 1..daysInMonth
    }

    private fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    }

    fun displayDate() {
        if (isValidDate()) {
            println("Date: $day/$month/$year is valid.")
        } else {
            println("Date: $day/$month/$year is not valid.")
        }
    }
}

fun main() {
    val date = Date()

    println("Enter day:")
    val day = readLine()!!.toInt()

    println("Enter month:")
    val month = readLine()!!.toInt()

    println("Enter year:")
    val year = readLine()!!.toInt()

    date.setDate(day, month, year)

    date.displayDate()
}
