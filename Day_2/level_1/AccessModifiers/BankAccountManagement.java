// Base class: BankAccount
class BankAccount {
    // Public member: accountNumber
    public String accountNumber;

    // Protected member: accountHolder
    protected String accountHolder;

    // Private member: balance
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance (modify it)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount. Balance cannot be negative.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        // Call the parent class constructor
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to apply interest on the balance
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Applied Interest: $" + interest);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails();  // Call parent method to display common account details
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the BankAccount and SavingsAccount classes
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        
        // Display initial account details
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();

        // Deposit and withdraw money
        account1.deposit(500.0);
        account1.withdraw(200.0);

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Smith", 2000.0, 3.5);
        
        // Display savings account details
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
        
        // Apply interest to the savings account
        savingsAccount.applyInterest();
        savingsAccount.displaySavingsAccountDetails();  // Display updated details after applying interest
    }
}