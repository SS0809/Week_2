import java.util.Scanner;

public class Student {
    private String name;
    private String rollNumber;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;

    // Constructor to initialize student details
    public Student(String name, String rollNumber, int physicsMarks, int chemistryMarks, int mathsMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }

    // Method to calculate the grade
    public String calculateGrade() {
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 3.0);

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("Chemistry Marks: " + chemistryMarks);
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter Physics Marks: ");
        int physicsMarks = scanner.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        int chemistryMarks = scanner.nextInt();
        System.out.print("Enter Maths Marks: ");
        int mathsMarks = scanner.nextInt();

        // Create Student object
        Student student = new Student(name, rollNumber, physicsMarks, chemistryMarks, mathsMarks);

        // Display details
        student.displayDetails();
    }
}
