public class CarRental {
    // Attributes of the CarRental class
    private String customerName;
    private String carModel; // e.g., Sedan, SUV, Hatchback
    private int rentalDays;
    private static final double COST_PER_DAY = 50.0; // Rental cost per day (constant)

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1; // Default rental days is 1
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays > 0 ? rentalDays : 1; // Ensure rental days is at least 1
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental Details:");
        defaultRental.displayRentalDetails();

        // Using the parameterized constructor
        CarRental parameterizedRental = new CarRental("Alice Johnson", "SUV", 5);
        System.out.println("\nParameterized Rental Details:");
        parameterizedRental.displayRentalDetails();

        // Using the copy constructor
        CarRental copiedRental = new CarRental(parameterizedRental);
        System.out.println("\nCopied Rental Details:");
        copiedRental.displayRentalDetails();

        // Modifying the copied rental details
        copiedRental.customerName = "Bob Smith";
        copiedRental.carModel = "Sedan";
        copiedRental.rentalDays = 3;
        System.out.println("\nModified Copied Rental Details:");
        copiedRental.displayRentalDetails();
    }
}