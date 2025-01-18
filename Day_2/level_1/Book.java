/*
Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
*/
public class Book{
    private String title;
    private String author;
    private int price;
    Book(){
        System.out.println(title+author+price);
    }   
    Book(String title , String author ,  int price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println(title+author+price);
    }    
    public static void main (String[] args){
        Book bk = new Book("The usage", "Saurabh", 1500);
    }
}