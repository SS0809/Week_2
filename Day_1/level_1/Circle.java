/*
Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius.
*/
import java.util.Scanner;
public class Circle{
	private double radius ;
	private double area ;
	public double getArea(){
		return area;
	}
	public void setArea(double radius){
		this.area = Math.PI * radius; 
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius; 
	}
	// Add methods to calculate and display the area and circumference of the circle.
	public double display(){
		return this.area;
	}
	public void calculate(double radius){
		this.setArea(radius);
	}
	public static void main(String[] args){
		Circle c = new Circle();
		Scanner scn = new Scanner(System.in);
		double radiusFromUser = scn.nextDouble();
		c.calculate(radiusFromUser);
		System.out.println(c.display());
	}
}