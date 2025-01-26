package com.problems.bankingsystem;

//Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
public class CurrentAccount extends BankAccount{
    private double interest;

    public double getInterestAmount() {
        this.calculateInterest();
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    private double interestAmount ;
    CurrentAccount(int accountNumber , String holderName){
        super.setAccountNumber(accountNumber);
        super.setHolderName(holderName);
        this.interest = 4.0;
        super.setBalance(0.0);
    }
    @Override
    void calculateInterest() {//per quarter
        setInterestAmount(( super.getBalance() * interest ) / 100);
    }
    @Override
    public void applyForLoan(){
        this.setAppliedForLoan(true);
    }

    @Override
    public void calculateLoanEligibility() {
        if (this.getBalance()>5000){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
