public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "Tech Academy";

    // Constructor to initialize instance variables
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 8, 499.99);
        Course course2 = new Course("Web Development", 12, 799.99);

        // Display details of courses
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        // Updating the institute name
        System.out.println("\nUpdating Institute Name to 'Global Tech Institute'...");
        Course.updateInstituteName("Global Tech Institute");

        // Display details again to reflect the updated institute name
        System.out.println("\nUpdated Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nUpdated Course 2 Details:");
        course2.displayCourseDetails();
    }
}
