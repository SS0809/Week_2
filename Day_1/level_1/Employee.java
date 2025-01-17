/*
Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
*/
public class Employee {
	private String name;
	private int id;
	private double salary;
	Employee(String name , int id , double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}	
	public void getDetails(){
		System.out.println("Id : "+ this.id);
		System.out.println("Name : "+ this.name);
		System.out.println("Salary : "+ this.salary);
	}
	public static void main (String[] args){
		Employee obj = new Employee("Saurabh",1,1200000.0);
		obj.getDetails();
	}
}