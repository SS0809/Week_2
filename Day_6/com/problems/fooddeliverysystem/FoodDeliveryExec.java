package com.problems.fooddeliverysystem;
//. Online Food Delivery System
//Description: Create an online food delivery system:
//Define an abstract class FoodItem with fields like itemName, price, and quantity.
//Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
//Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
//Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
//Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

public class FoodDeliveryExec {
    public static void main(String[] args) {
        // Creating objects for VegItem and NonVegItem classes
        FoodItem item1=new VegItem("Dosa",120,2);
        FoodItem item2=new NonVegItem("Biryani",300,1);
        // performing operation
        item1.applyDiscount(10);
        item2.applyDiscount(8);
        int extraChargeOnVegFood=20;
        int extraChargeOnNonVegFood=50;
        item1.calculateTotalPrice(extraChargeOnVegFood);
        item2.calculateTotalPrice(extraChargeOnNonVegFood);
        item1.getItemDetails();
        System.out.println("===========================");
        item2.getItemDetails();
    }
}