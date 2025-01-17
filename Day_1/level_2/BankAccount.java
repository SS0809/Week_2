/*
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
Explanation: The BankAccount class stores bank account details as attributes.
The methods allow interaction with these attributes to modify and view the account's state.

*/
public class BankAccount {
//    Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder , String accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    //    Displaying the current balance.
    public double currentBalance(){
        return this.balance;
    }
    public boolean depositMoney(double addedMoney) {
        try{
            //    Depositing money.
            this.balance += addedMoney;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean withdrawMoney(double withdrawAmount){
        //    Withdrawing money (only if sufficient balance exists).
        try{
            if(this.balance>=withdrawAmount) {
                this.balance -= withdrawAmount;
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args){
        BankAccount bk = new BankAccount("Saurabh Saraswat" , "1248cs0245c0dds" , 1000);
        System.out.println(bk.currentBalance());
        if(bk.depositMoney(500)){
            System.out.println("Amount Deposited");
        }else{
            System.out.println("Some error happened");
        }
        if(bk.withdrawMoney(45000)){
            System.out.println("Amount withdrawn");
        }else{
            System.out.println("Not enough funds");
        }
    }
}
