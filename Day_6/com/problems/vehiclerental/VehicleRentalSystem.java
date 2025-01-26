/**
 Vehicle Rental System
 Description: Design a system to manage vehicle rentals:

 Add an abstract method calculateRentalCost(int days).
 Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
 Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
 Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
 Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

 */

package com.problems.vehiclerental;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vh = new ArrayList<>();
        vh.add(new Car(1500,"Car" , 987564 ,35,500000,1000));
        vh.add(new Truck(2500,"Truck" , 927564 ,20,500000,1000));
        vh.add(new Bike(500,"Bike" , 987554 ,26,500000,1000));

        for (Vehicle v: vh) {
            if (v instanceof Car) {
                Car vV = (Car) v;
                vV.getVehicleDetails();
                System.out.println("Rental rate : " + vV.calculateRentalCost(5));
                vV.calculateInsurance();
                vV.getInsuranceDetails();
            }else if (v instanceof Truck) {
                Truck vV = (Truck) v;
                vV.getVehicleDetails();
                System.out.println("Rental rate : " + vV.calculateRentalCost(5));
                vV.calculateInsurance();
                vV.getInsuranceDetails();
            } else if (v instanceof Bike) {
                Bike vV = (Bike) v;
                vV.getVehicleDetails();
                System.out.println("Rental rate : " + vV.calculateRentalCost(5));
                vV.calculateInsurance();
                vV.getInsuranceDetails();
            }
        }
    }
}
