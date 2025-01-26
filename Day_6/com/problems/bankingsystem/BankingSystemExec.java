package com.problems.bankingsystem;
//Banking System
//Description: Create a banking system with different account types:
//Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
//Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
//Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
//Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
//Use encapsulation to secure account details and restrict unauthorized access.
//Demonstrate polymorphism by processing different account types and calculating interest dynamically.

public class BankingSystemExec {
    public static void main(String[] args) {
        //create an savings account
        SavingsAccount sa = new SavingsAccount(965896,"Saurabh Saraswat");
        sa.deposit(500);
        sa.getAccountDetails();
        sa.applyForLoan();
        String temp = (sa.isAppliedForLoan())?"Yes":"No";
        sa.calculateLoanEligibility();
        System.out.println("Loan Details : "+ temp+"\nQuarterly Interest on Current Amount : " + sa.getInterestAmount()+ "\n");//per quarter interest
        SavingsAccount ca = new SavingsAccount(965878,"Tanu Tiwari");
        ca.deposit(600);
        ca.getAccountDetails();
        ca.applyForLoan();
        temp = (sa.isAppliedForLoan())?"Yes":"No";
        ca.calculateLoanEligibility();
        System.out.println("Loan Details : "+ temp+"\nQuarterly Interest on Current Amount : " + sa.getInterestAmount()+"\n");//per quarter interest
    }
}
