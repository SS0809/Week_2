package assistedproblems;
/*
Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it.
A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.
*/
class Bank{
    public void openAccount(Customer c){
        System.out.println("Account opened for "+c.getName() );
    }
}
class Customer{
    private String name;
    private int balance ;
    public String getName(){
        return this.name;
    }
    Customer(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    public void viewBalance(){
        System.out.println("Balance for "+this.name+": $"+this.balance);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        //Association Bank can survive without Customer but Customer can't survive without Bank
        Customer c = new Customer("Saurabh" , 1000);
        b.openAccount(c);
        c.viewBalance();
        Customer c1 = new Customer("Uday" , 100);
        b.openAccount(c1);
        c1.viewBalance();
        Customer c2 = new Customer("Amit", 500);
        b.openAccount(c2);
        c2.viewBalance();
    }
}