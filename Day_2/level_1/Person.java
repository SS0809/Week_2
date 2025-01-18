/*
Create a Person class with a copy constructor that clones another person's attributes.
*/
public class Person{
    private int height;
    private int weight;
    Person(int height , int weight){
        this.height = height;
        this.weight = weight;
    }
    Person(Person p){
        this.height = p.height;
        this.weight = p.weight;
    }
    public static void main(String[] args){
        Person pn = new Person(1,2);
        Person pn2 = new Person(pn);
        if(pn.height == pn2.height){
            System.out.println("Copy Constructor is working");
        }
    }
}