package com.problems.ridehailingapplication;

public class Main {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle car = new Car("CAR123", "Alice", 15.0);
        Vehicle bike = new Bike("BIKE456", "Bob", 8.0);
        Vehicle auto = new Auto("AUTO789", "Charlie", 10.0);

        // Demonstrating polymorphism
        printFare(car, 10);
        printFare(bike, 15);
        printFare(auto, 20);

        // Update and display GPS location
        if (car instanceof GPS) {
            ((GPS) car).updateLocation("Downtown");
            System.out.println("Car Location: " + ((GPS) car).getCurrentLocation());
        }
    }

    // mrthod for printing details
    public static void printFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        System.out.println();
    }
}
