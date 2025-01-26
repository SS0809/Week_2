package com.problems.fooddeliverysystem;

public class VegItem extends FoodItem{
    // extra attribute for VegItem class
    private double extraCharge;

    // constructor for VegItem class
    public VegItem(String itemName, double price, int quantity){
        super(itemName,price,quantity);
    }

    // defining abstract method of FoodItem
    @Override
    public void calculateTotalPrice(double extraCharge) {
        this.extraCharge = extraCharge;
        setTotalPrice(getPrice() * getQuantity());
        setTotalPrice(getTotalPrice() + extraCharge);
        setTotalPrice(getTotalPrice() - getTotalPrice() * getDiscount() / 100);
    }

    // printing the details
    @Override
    public void getItemDetails() {
        System.out.println("Veg Food...");
        System.out.println("FoodItem name : " + getItemName());
        System.out.println("FoodItem price : " + getPrice());
        System.out.println("FoodItem quantity : " + getQuantity());
        System.out.println("Extra charge : " + extraCharge);
        System.out.println("Discount : " + getDiscountDetails()+"%");
        System.out.println("Total Amount to Pay : " + getTotalPrice());
    }
}