import java.util.Scanner;

class task3f {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine!");

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount < 0) {
                        System.out.println("Invalid deposit amount. Please enter a non-negative amount.");
                    } else {
                        atm.deposit(depositAmount);
                        System.out.println("Deposited $" + depositAmount + " successfully.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount < 0) {
                        System.out.println("Invalid withdrawal amount. Please enter a non-negative amount.");
                    } else if (!atm.withdraw(withdrawalAmount)) {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    } else {
                        System.out.println("Withdrawn $" + withdrawalAmount + " successfully.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true; // Withdrawal successful
        }
        return false; // Withdrawal failed
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double checkBalance() {
        return bankAccount.checkBalance();
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return bankAccount.withdraw(amount);
    }
}
