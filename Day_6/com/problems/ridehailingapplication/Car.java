package com.problems.ridehailingapplication;

public class Car extends Vehicle implements GPS {
    // attributes for car class
    private String currentLocation;

    // Constructor for car class
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // defining abstract method
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // define interface method
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // define interface method
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}