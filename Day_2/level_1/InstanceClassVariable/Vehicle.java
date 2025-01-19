public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType; // e.g., Car, Bike, Truck

    // Class variable (shared among all vehicles)
    private static double registrationFee = 100.00;

    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid fee. Registration fee must be positive.");
        }
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Bike");

        // Display details of vehicles
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Updating the registration fee
        System.out.println("\nUpdating Registration Fee to $150.00...");
        Vehicle.updateRegistrationFee(150.00);

        // Display details again to reflect the updated registration fee
        System.out.println("\nUpdated Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nUpdated Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
