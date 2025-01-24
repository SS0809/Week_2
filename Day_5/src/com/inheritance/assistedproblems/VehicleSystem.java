/*
Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:



Goal:
*/
package com.inheritance.assistedproblems;

import java.util.ArrayList;

class Vehicle {
    // Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){
        System.out.println("MaxSpeed " + this.maxSpeed + "\nFuelType " + this.fuelType );
    }
}
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed, String fuelType , int seatCapacity) {
        super(maxSpeed ,fuelType);
        this.seatCapacity = seatCapacity ;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("seatCapacity " + this.seatCapacity );
    }
}

class Truck extends Vehicle{
    int loadCapacity;
    Truck(int maxSpeed, String fuelType , int loadCapacity) {
        super(maxSpeed ,fuelType);
        this.loadCapacity = loadCapacity ;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("loadCapacity " + this.loadCapacity );
    }
}


class MotorCycle extends Vehicle{
    int tireStrength;
    MotorCycle(int maxSpeed, String fuelType , int tireStrength) {
        super(maxSpeed ,fuelType);
        this.tireStrength = tireStrength ;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("tireStrength " + this.tireStrength );
    }
}


public class VehicleSystem{
    public static void main(String[] args) {
    //  Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
        MotorCycle mc = new MotorCycle(110 , "Petrol" , 10);
        Car cr = new Car(240 , "Petrol" , 5);
        Truck tk = new Truck(120 , "Diesel" ,102000);


        ArrayList<Vehicle> alv = new ArrayList<>();
        alv.add(mc);
        alv.add(cr);
        alv.add(tk);
//        Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
        for (Vehicle vh: alv
             ) {
//            Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
            System.out.println("\n"+vh.getClass().getName());
            vh.displayInfo();
        }
    }
}