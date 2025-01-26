package com.problems.hospitalmanagement;

public abstract class Patient {
    // attributes for Patient class
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;

    // constructor for Patient class with patientId, name, and age attributes
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    // abstract methods for Patient
    public abstract double calculateBill();

    // method to get patient details
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // method to add medical history record
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    // method to view medical history record
    public String viewRecords() {
        return medicalHistory;
    }
}

