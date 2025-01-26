package com.problems.hospitalmanagement;

public class Main {
    public static void main(String[] args) {
        // creating objects of Patient and its subclasses (InPatient and OutPatient)
        Patient inPatient = new InPatient("1", "John Doe", 30, 5);
        Patient outPatient = new OutPatient("2", "Jane Doe", 40, "Consultation");

        // performing operations on the objects
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: $" + inPatient.calculateBill());
        inPatient.addRecord("Checkup completed.");
        System.out.println("Medical Records:\n" + inPatient.viewRecords());
        System.out.println();
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: $" + outPatient.calculateBill());
        outPatient.addRecord("Checkup completed.");
        System.out.println("Medical Records:\n" + outPatient.viewRecords());
        System.out.println();
    }
}