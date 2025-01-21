/*

Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
*/

public class Book{
    private String title, author;
    private final String isbn; 
    // Final:
    // Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
    static String libraryName;
    // Static:
    // A static variable libraryName shared across all books.
    // A static method displayLibraryName() to print the library name.
    static void displayLibraryName(){
        System.out.print(libraryName);
    }
    // This:
    // Use this to initialize title, author, and isbn in the constructor.
    Book(String title , String author , String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    private void displayAccountDetails(){
        if(this instanceof Book){
            System.out.println("title : " + title);
            System.out.println("Author : " + author);
            System.out.println("isbn : "+ isbn);
        }
    }
    public static void main(String[] args) {     
    // Instanceof:
    // Verify if an object is an instance of the Book class before displaying its details.
    Book bk = new Book("title1","Sir A.J ", "d1xs5015");
    Book bk2 = new Book("title2","Sir A.P ", "d1xs5016");
    bk.displayAccountDetails();
    bk2.displayAccountDetails();
    }

}