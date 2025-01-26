package com.problems.ridehailingapplication;

public class Bike extends Vehicle implements GPS {
    // attributes for bike class
    private String currentLocation;

    // Constructor for bike class
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // defining abstract method
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // Bikes get a 10% discount
    }

    // defining interface method
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // defining interface method
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}