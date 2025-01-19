// Base class: Book
class Book {
    // Public member: ISBN
    public String ISBN;

    // Protected member: title
    protected String title;

    // Private member: author
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (inherits from Book)
class EBook extends Book {
    private String fileSize; // Additional attribute for EBook

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, String fileSize) {
        // Call the parent class constructor
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);  // Accessing public member from parent class
        System.out.println("Title: " + title); // Accessing protected member from parent class
        System.out.println("File Size: " + fileSize);
    }
}

// Main class to test the Book and EBook classes
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        
        // Display details of the book
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Set and get the author name using public methods
        System.out.println("\nChanging author...");
        book1.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book1.getAuthor());

        // Create an EBook object
        EBook ebook1 = new EBook("978-1-23-456789-0", "Mastering Python", "Alice Johnson", "5MB");

        // Display details of the eBook
        System.out.println("\nEBook Details:");
        ebook1.displayEBookDetails();
    }
}
