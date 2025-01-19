public class Person {
    // Attributes of the Person class
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name; // Copy the name
        this.age = other.age;   // Copy the age
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        }
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create a person using the parameterized constructor
        Person originalPerson = new Person("John Doe", 30);
        System.out.println("Original Person Details:");
        originalPerson.displayDetails();

        // Create a copy of the original person using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person Details:");
        clonedPerson.displayDetails();

        // Modify the cloned person's attributes
        clonedPerson.setName("Jane Doe");
        clonedPerson.setAge(25);
        System.out.println("\nModified Cloned Person Details:");
        clonedPerson.displayDetails();
    }
}
