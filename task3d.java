//Create a class to represent the user's bank account, which stores the account balance

public class task3d {
    private double balance; // Stores the account balance

    // Constructor to initialize the balance
    public task3d(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            balance = 0;
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of $1000
        task3d userAccount = new task3d(1000.0);

        // Check the initial balance
        System.out.println("Initial balance: $" + userAccount.checkBalance());

        // Deposit $500 into the account
        userAccount.deposit(500.0);

        // Check the updated balance
        System.out.println("Updated balance after deposit: $" + userAccount.checkBalance());

        // Withdraw $200 from the account
        userAccount.withdraw(200.0);

        // Check the final balance
        System.out.println("Final balance after withdrawal: $" + userAccount.checkBalance());
    }
}
