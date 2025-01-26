package com.problems.vehiclerental;

//Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
public class Bike extends Vehicle {
    public int getAge() {
        return age;
    }

    public int getDeductible_amount() {
        return deductible_amount;
    }

    int age;

    public int getCoverage_amount() {
        return coverage_amount;
    }

    int coverage_amount;


    public void setDeductible_amount(int deductible_amount) {
        this.deductible_amount = deductible_amount;
    }

    public void setCoverage_amount(int coverage_amount) {
        this.coverage_amount = coverage_amount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int deductible_amount;
    Bike(int rentalRate ,String type ,int vehicleNumber , int age, int coverage_amount,int deductible_amount){
        super(rentalRate ,type,vehicleNumber);
        setAge(age);
        setCoverage_amount(coverage_amount);
        setDeductible_amount(deductible_amount);

    }
    void getVehicleDetails(){
        System.out.println(super.getType());
    }
    @Override
    int calculateRentalCost(int days) {
        return (days*super.getRentalRate());
    }

    @Override
    public void calculateInsurance() {
        System.out.println( "Insurance Calculated : " + ((this.getCoverage_amount() / 1000 ) * ( this.getAge() / 10 ) + ( this.getDeductible_amount() / 10 )));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println( "Coverage Amount : " + this.getCoverage_amount()  +"\nAge : "+  this.getAge() +"\nDeductive Amount : " +  this.getDeductible_amount() + "\n" );
    }
}
