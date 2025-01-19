public class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter and Setter for Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) { // Ensuring price is not negative
            this.price = price;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayBookDetails();

        // Using the parameterized constructor
        Book parameterizedBook = new Book("The Alchemist", "Paulo Coelho", 299.99);
        System.out.println("\nParameterized Book Details:");
        parameterizedBook.displayBookDetails();
    }
}
