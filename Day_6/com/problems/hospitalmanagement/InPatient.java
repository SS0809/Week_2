package com.problems.hospitalmanagement;
public class InPatient extends Patient{
    // attributes for inpatient
    private int daysStayed;

    // constructor for inpatient class
    public InPatient(String patientId, String name, int age, int daysStayed) {
        super(patientId, name, age);
        this.daysStayed = daysStayed;
    }

    // defining abstract method
    @Override
    public double calculateBill() {
        return daysStayed * 300;
    }
}