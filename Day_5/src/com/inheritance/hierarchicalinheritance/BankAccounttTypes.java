/*
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:



Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
*/
package com.inheritance.hierarchicalinheritance;

class BankAccount{
//    Define a base class BankAccount with attributes like accountNumber and balance.
    int accountNumber;
    double balance;
    BankAccount(int accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

//Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
class SavingsAccount extends BankAccount{
    int interestRate;
    SavingsAccount(int interestRate , int accountNumber , double balance){
        super(accountNumber,  balance);
        this.interestRate = interestRate;
    }
    //    Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType(){
        String parts[] = this.getClass().getName().toString().split("\\.");
        System.out.println("\n"+parts[3]);
        System.out.println("Interest Rate "+ interestRate + "\nAccount Number "+ accountNumber + "\nBalance " + balance);
    }
}

class CheckingAccount extends BankAccount{
    int withdrawalLimit;
    CheckingAccount(int withdrawalLimit , int accountNumber , double balance){
        super(accountNumber,  balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    //    Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType(){
        String parts[] = this.getClass().getName().toString().split("\\.");
        System.out.println("\n"+parts[3]);
        System.out.println("Withdrawal Limit "+ withdrawalLimit + "\nAccount Number "+ accountNumber + "\nBalance " + balance);
    }
}

class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(int accountNumber , double balance){
        super(accountNumber,  balance);
    }
    //    Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType(){
        String parts[] = this.getClass().getName().toString().split("\\.");
        System.out.println("\n"+parts[3]);
        System.out.println("Account Number "+ accountNumber + "\nBalance " + balance);
    }
}



public class BankAccounttTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10 , 456048 , 65000.0);
        sa.displayAccountType();
        CheckingAccount ca = new CheckingAccount(45000, 486102,6532.0);
        ca.displayAccountType();
        FixedDepositAccount fa = new FixedDepositAccount(484156 , 980000.0);
        fa.displayAccountType();
    }
}
