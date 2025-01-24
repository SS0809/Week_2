/*
Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:


Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/
package com.inheritance.assistedproblems;


class Employee {
//    Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
    String name;
    int id;
    double salary;
    Employee(String name , int id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name is " + this.name + "\nId "+ this.id + "\nSalary " + this.salary);
    }
}

//Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
class Manager extends Employee{
    int teamSize;
    Manager(String name , int id , double salary, int teamSize){
        super(name , id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size is "+ this.teamSize + "\n");
    }
}

class Developer extends Employee{
    String programmingLanguage;
    Developer(String name , int id , double salary , String programmingLanguage){
        super(name , id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Prog lang " + this.programmingLanguage + "\n");
    }
}

class Intern extends Employee{
    Intern(String name , int id , double salary){
        super(name , id, salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee em = new Employee("Saurabh" , 518653, 54.000);
        Manager em1 = new Manager("Amol" , 499653, 540000 , 12);
        Developer em2 = new Developer("Saurabh" , 418000, 540000 , "JAVA");
        Intern em3 = new Intern("Uday" , 360000, 54.000 );
        em1.displayDetails();
        em2.displayDetails();
        em3.displayDetails();
    }
}

