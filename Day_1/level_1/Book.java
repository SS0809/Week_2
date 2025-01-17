/*
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
*/
public class Book{
    private String title;
    private String author;
    private double price;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void getDetails(){
        System.out.println("Title : "+ this.title);
        System.out.println("Author : "+ this.author);
        System.out.println("Price : "+ this.price);
    }
    public static void main (String[] args){
        Book obj = new Book();
        obj.setAuthor("Sir Saurabh Saraswat");
        obj.setTitle("The tales of Large Ocean");
        obj.setPrice(695.5);
        obj.getDetails();
    }


}