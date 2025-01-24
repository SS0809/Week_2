/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:

Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/
package com.inheritance.singleinheritance;

public class Device {
    // Define attributes for the superclass Device
    int deviceId;
    boolean status;

    // Constructor for Device class
    public Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

// Subclass Thermostat inheriting from Device
class Thermostat extends Device {
    // Additional attribute specific to Thermostat
    int temperatureSetting;

    // Constructor for Thermostat class
    public Thermostat(int deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override the displayStatus method to include temperatureSetting
    @Override
    void displayStatus() {
        super.displayStatus(); // Call the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Test class
class Main {
    public static void main(String[] args) {
        // Create an instance of Thermostat
        Thermostat thermostat = new Thermostat(101, true, 24);

        // Display the status of the thermostat
        thermostat.displayStatus();
    }
}
