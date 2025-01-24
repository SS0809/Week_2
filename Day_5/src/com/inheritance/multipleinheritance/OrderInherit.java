/*
Sample Problem 1: Online Retail Order Management
Description:
Tasks:



Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/
package com.inheritance.multipleinheritance;

import java.util.Calendar;
import java.util.Date;

//Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
class Order{
//    Define a base class Order with common attributes like orderId and orderDate.
 Date orderDate ;
 int orderId;
 Order(Date orderDate , int orderId){
     this.orderDate = orderDate;
     this.orderId = orderId;
 }
 void getOrderStatus(){
     String[] parts = this.getClass().getName().split("\\.");
     System.out.println("\n" + parts[3] + "\nOrderDate : " + orderDate + "\nOrderID "+ orderId);
 }
}
class ShippedOrder extends Order{
//    Create a subclass ShippedOrder with additional attributes like trackingNumber.
    int trackingNumber;
    ShippedOrder(int trackingNumber , Date orderDate, int orderId){
        super( orderDate, orderId);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("TrackingNumber : " +trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
//    Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
    Date deliveryDate;
    DeliveredOrder(Date deliveryDate ,int trackingNumber , Date orderDate, int orderId){
        super(trackingNumber ,  orderDate,  orderId);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Deliverydate : " + deliveryDate );
    }
}
public class OrderInherit {
    public static void main(String[] args) {
        Date date = new Date(2024, Calendar.DECEMBER,25);
        Date ddate = new Date(2024, Calendar.DECEMBER,28);
        Order or = new Order(date,12);
        ShippedOrder sr = new ShippedOrder(101 , date,12);
        DeliveredOrder dr = new DeliveredOrder(ddate , 101 , date,12);
        or.getOrderStatus();
        sr.getOrderStatus();
        dr.getOrderStatus();
    }
}
