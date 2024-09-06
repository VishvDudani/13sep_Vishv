class BankAccount {
    private var accountNumber: String = ""
    private var balance: Double = 0.0

    fun setAccountDetails(accountNumber: String, initialBalance: Double) {
        this.accountNumber = accountNumber
        this.balance = initialBalance
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Successfully deposited $$amount. New balance: $$balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Successfully withdrew $$amount. Remaining balance: $$balance")
        } else {
            println("Insufficient funds or invalid amount.")
        }
    }

    fun displayBalance() {
        println("Account Number: $accountNumber")
        println("Current Balance: $$balance")
    }
}

fun main() {
    val account = BankAccount()

    account.setAccountDetails("1234567890", 500.0)

    account.displayBalance()

    account.deposit(200.0)

    account.withdraw(100.0)

    account.withdraw(700.0)

    account.displayBalance()
}
