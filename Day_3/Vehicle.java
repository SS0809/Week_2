/*
Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:




*/
public class Vehicle {
    // Static:
    // A static variable registrationFee common for all vehicles.
    // A static method updateRegistrationFee() to modify the fee.
    private static int registrationFee;
    private int updateRegistrationFee(int feeUpdate){
        registrationFee = feeUpdate;
        return registrationFee; 
    }
    // Final:
    // Use a final variable registrationNumber to uniquely identify each vehicle.
    private final int registrationNumber; 
    // This:
    // Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
    private String ownerName, vehicleType;
    Vehicle(String ownerName ,String vehicleType, int regFee, int registrationNumber){
        registrationFee = regFee;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Instanceof:
    // Check if an object belongs to the Vehicle class before displaying its registration details.
    private void displayRegistrationDetails(){
        if(this instanceof Vehicle){
            System.out.println("registrationFee : " + this.registrationFee);
            System.out.println("ownerName : " + this.ownerName);
            System.out.println("vehicleType : "+ this.vehicleType);
            System.out.println("registrationNumber : "+ this.registrationNumber);
        }
    }
    public static void main(String[] args) {
        Vehicle vh = new Vehicle("Saurabh","Car", 500,153620);
        Vehicle vh1 = new Vehicle("Uday","Car", 500,156620);
        vh.displayRegistrationDetails();
        vh1.displayRegistrationDetails();
    }
}