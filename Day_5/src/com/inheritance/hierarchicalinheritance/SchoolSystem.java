/*
Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:



Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/

package com.inheritance.hierarchicalinheritance;

//Define a superclass Person with common attributes like name and age.
class Person{
    String name ;
    int age ;
    Person(String name , int age ){
        this.age = age;
        this.name = name ;
    }
}

//Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
class Teacher extends Person{
    String subject;
    Teacher(String name , int age , String subject){
        super( name , age);
        this.subject =subject;
    }
//    Each subclass should have a method like displayRole() that describes the role.
    void displayRole(){
        System.out.println("Name "+name+" Age "+age +" subject "+subject);
    }
}
class Student extends Person{
    String grade;
    Student(String name , int age , String grade){
        super( name , age);
        this.grade =grade;
    }
    //    Each subclass should have a method like displayRole() that describes the role.
    void displayRole(){
        System.out.println("Name "+name+" Age "+age +" grade "+grade);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Dr. Saurabh",36,"Maths");
        t.displayRole();
        Student s = new Student("Saurabh" , 19,"A");
        s.displayRole();
    }
}
