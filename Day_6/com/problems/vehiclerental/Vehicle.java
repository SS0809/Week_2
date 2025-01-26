package com.problems.vehiclerental;

//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
public abstract class Vehicle implements Insurable {
    int vehicleNumber;
    String type;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    int rentalRate;

    //Add an abstract method calculateRentalCost(int days).
    abstract int calculateRentalCost(int days);
    Vehicle(int rentalRate , String type, int vehicleNumber){
        setRentalRate(rentalRate);
        setType(type);
        setVehicleNumber(vehicleNumber);
    }
}
