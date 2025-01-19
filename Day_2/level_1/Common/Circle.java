/*
Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
*/
public class Circle{
    private double radius;
    Circle(){
        this(1.0);// calls parameterised constructor
    }
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.getRadius());
    }
}