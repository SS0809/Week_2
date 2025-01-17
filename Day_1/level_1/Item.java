import java.util.Scanner;

/*
Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price.
*/
public class Item {
    //    Create an Item class with attributes itemCode, itemName, and price.
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity;
    private double totalCost;


    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    Item(){
        this.setItemCode(456987);
        this.setItemName("Chips");
        this.setPrice(15);
    }
//    Add a method to display item details and
    private void display(){
        System.out.println("Item code is "+ this.itemCode);
        System.out.println("Item name is "+ this.itemName);
        System.out.println("Item price is "+ this.price);
        System.out.println("Item quantity is "+ this.quantity);
        System.out.println("Item total cost is "+ this.totalCost);
    }
//    calculate the total cost for a given quantity.
    private double calculate(int quantity ){
        this.quantity = quantity;
        this.totalCost = (this.price * quantity);
        return this.totalCost;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int quantity  = scn.nextInt();
        Item it = new Item();
        it.calculate(quantity);
        it.display();
    }


}
