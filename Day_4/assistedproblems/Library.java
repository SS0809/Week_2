package assistedproblems;
/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. 
Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
*/
import java.util.ArrayList;
import java.util.Iterator;
class Book{
	private String title;
	private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
public class Library {	
	
	ArrayList<Book> al = new ArrayList<>();
	public Library(Book b) {
		al.add(b);
	}
	public ArrayList<Book> showBooks() {
		return al;
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("Java");
		b1.setAuthor("James Gosling");
		Book b2 = new Book();
		b2.setTitle("Python");
		b2.setAuthor("Guido van Rossum");
		Library l1 = new Library(b1);
		System.out.println("\nBooks in Library 1");
		Iterator<Book> itr = l1.showBooks().iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println("Book Title: "+b.getTitle());
			System.out.println("Book Author: "+b.getAuthor());
		}
		Library l2 = new Library(b2);
		System.out.println("\nBooks in Library 2");
		Iterator<Book> it = l2.showBooks().iterator();
		while(it.hasNext()) {
			Book b = it.next();
			System.out.println("Book Title: "+b.getTitle());
			System.out.println("Book Author: "+b.getAuthor());
		}
	}
}