// Base class: Student
class Student {
    // Public member
    public int rollNumber;

    // Protected member
    protected String name;

    // Private member
    private double CGPA;

    // Constructor to initialize roll number, name, and CGPA
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        // Call the superclass constructor
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member 'name' from superclass
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Public member
        System.out.println("Name: " + name); // Protected member
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to test the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 8.5);

        // Access and modify CGPA using public methods
        student.displayDetails();
        System.out.println("Updating CGPA...");
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.2, "Machine Learning");
        pgStudent.displayPostgraduateDetails();
    }
}