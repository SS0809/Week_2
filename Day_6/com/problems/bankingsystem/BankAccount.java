package com.problems.bankingsystem;

public abstract class BankAccount implements Loanable{
    boolean isAppliedForLoan = false;

    public boolean isAppliedForLoan() {
        return isAppliedForLoan;
    }

    public void setAppliedForLoan(boolean appliedForLoan) {
        isAppliedForLoan = appliedForLoan;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    //    Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
    private int accountNumber ;
    private String holderName ;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance ;

//    Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
    boolean deposit(double amount){ // concrete methods
//        balance += amount;   deprecated
        setBalance(amount + getBalance());
        return true;
    }
    boolean withdraw(double amount){ // concrete methods
        if(amount <= getBalance()){
//            balance -= amount;
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    void getAccountDetails(){
        System.out.println( "Account Holder Name : " + getHolderName() + "\nAccount Number : " + getAccountNumber()+ "\nAccount Balance : " + getBalance());
    }
    void calculateInterest() {}
}
