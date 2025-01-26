package com.problems.hospitalmanagement;

public class OutPatient extends Patient{
    // attributes for outpatient
    private String treatmentType;

    // constructor for outpatient class
    public OutPatient(String patientId, String name, int age, String treatmentType) {
        super(patientId, name, age);
        this.treatmentType = treatmentType;
    }

    // defining abstract method
    @Override
    public double calculateBill() {
        if (treatmentType.equals("Consultation")) {
            return 100;
        } else {
            return 200;
        }
    }
}
