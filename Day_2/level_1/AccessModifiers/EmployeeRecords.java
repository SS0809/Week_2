// Base class: Employee
class Employee {
    // Public member: employeeID
    public String employeeID;

    // Protected member: department
    protected String department;

    // Private member: salary
    private double salary;

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary
    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager (inherits from Employee)
class Manager extends Employee {
    private String managerialLevel;

    // Constructor for Manager
    public Manager(String employeeID, String department, double salary, String managerialLevel) {
        // Call the parent class constructor
        super(employeeID, department, salary);
        this.managerialLevel = managerialLevel;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails();  // Call parent method to display common employee details
        System.out.println("Managerial Level: " + managerialLevel);
    }
}

// Main class to test the Employee and Manager classes
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee1 = new Employee("E12345", "Engineering", 75000.0);
        
        // Display initial employee details
        System.out.println("Employee Details:");
        employee1.displayEmployeeDetails();

        // Modify and get salary using public methods
        System.out.println("\nUpdating salary...");
        employee1.modifySalary(80000.0);
        System.out.println("Updated Salary: $" + employee1.getSalary());

        // Create a Manager object
        Manager manager1 = new Manager("M98765", "Sales", 120000.0, "Senior");

        // Display manager details
        System.out.println("\nManager Details:");
        manager1.displayManagerDetails();
    }
}