package com.problems.ridehailingapplication;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // method for calculating distance (abstract method)
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.5;
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
