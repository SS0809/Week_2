/*
 Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
 */
public class BankAccount {
    // Static:
    // A static variable bankName shared across all accounts.
    private static String bankName;
    // Final:
    // Use a final variable accountNumber to ensure it cannot be changed once assigned.
    private final int accountNumber ;
    static String accountHolderName;
    private static int totalAccounts = 0;
    // A static method getTotalAccounts() to display the total number of accounts.
    private static int getTotalAccounts(){
        return totalAccounts;
    }
    // This:
    // Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
    BankAccount(String accountHolderName , int accountNumber){
        this.accountNumber = accountNumber ;
        this.accountHolderName= accountHolderName ;
        totalAccounts++;
    }

    private boolean checkThis(){
        // Instanceof:
        // Check if an account object is an instance of the BankAccount class before displaying its details.
    if(this instanceof BankAccount){
        return true;
    }else{
        return false;
    }
    }
    public static void main(String[] args) {
        BankAccount bk1 = new BankAccount("Saurabh",789461523);
        BankAccount bk2 = new BankAccount("Saurabh",789461525);
        BankAccount bk3= new BankAccount("Saurabh",789461251);
        System.out.print(totalAccounts+" "+(bk1.checkThis()));
    }
}
