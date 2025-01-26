package com.problems.fooddeliverysystem;

public class NonVegItem extends FoodItem{
    // extra attribute for NonVegItem class
    private double extraCharge;

    // constructor for NonVegItem class
    public NonVegItem(String itemName, double price, int quantity){
        super(itemName,price,quantity);
    }

    // defining abstract method of FoodItem
    @Override
    public void calculateTotalPrice(double extraCharge) {
        this.extraCharge=extraCharge;
        setTotalPrice(getPrice() * getQuantity());
        setTotalPrice(getTotalPrice() + extraCharge);
        setTotalPrice(getTotalPrice() - getTotalPrice() * getDiscount() / 100);
    }

    // printing the details
    @Override
    public void getItemDetails() {
        System.out.println("NonVeg Food...");
        System.out.println("FoodItem name : " + getItemName());
        System.out.println("FoodItem price : " + getPrice());
        System.out.println("FoodItem quantity : " + getQuantity());
        System.out.println("Extra charge : " + extraCharge);
        System.out.println("Discount : " + getDiscountDetails() + "%");
        System.out.println("Total Amount to Pay : " + getTotalPrice());
    }
}
