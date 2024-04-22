package Interface;

// Abstract class Accounts
abstract class Accounts {
    double balance;
    String accountNumber;
    String accountHolderName;
    String address;

    // Abstract methods
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    // Method to display balance for the given account number
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount inheriting from Accounts
class SavingsAccount extends Accounts {
    double rateOfInterest;

    // Method to calculate the amount with interest
    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Updated balance after interest calculation: " + balance);
    }

    // Implementation of abstract methods
    @Override
    void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }
}

// Main class
public class AccountsDemo {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = "123456";
        savingsAccount.balance = 1000.0;
        savingsAccount.rateOfInterest = 5.0; // 5% interest rate

        // Display initial balance
        System.out.println("Initial balance:");
        savingsAccount.display();

        // Deposit and withdraw
        savingsAccount.deposit(500.0);
        savingsAccount.withdrawal(200.0);

        // Display balance after transactions
        System.out.println("\nBalance after transactions:");
        savingsAccount.display();

        // Calculate amount with interest
        savingsAccount.calculateAmount();
    }
}
