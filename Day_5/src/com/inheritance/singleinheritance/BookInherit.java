/*
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:



Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/
package com.inheritance.singleinheritance;

class Book {
//    Define a superclass Book with attributes like title and publicationYear.
    String title ;
    int year;
    Book(String title , int year){
        this.title = title;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Title " + this.title  +" Year "+ this.year);
    }


}
class Author extends Book{
//    Define a subclass Author with additional attributes like name and bio.
    String name ;
    String bio;
    Author(String title , int year , String name , String bio){
        super(title , year);
        this.name = name;
        this.bio = bio;
    }

//    Create a method displayInfo() to show details of the book and its author.
    void displayInfo(){
        super.displayInfo();
        System.out.println("Bio " + this.bio + " Name "  + this.name);
    }
}


public class BookInherit{
    public static void main(String[] args) {
        Book bk = new Book("JavaBook", 2002);
        Author au = new Author("JavaBook2",2002,"javaName" , "book bio for java");
        bk.displayInfo();
        au.displayInfo();
    }
}
