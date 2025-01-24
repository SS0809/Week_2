/*
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:



Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

package com.inheritance.hybridinheritance;

class Person{
//    Define a superclass Person with attributes like name and id.
    String name ;
    int id ;
    Person(String name , int id){
        this.id = id;
        this.name = name;
    }
}
//Create an interface Worker with a method performDuties().
interface Worker{
    void perfomDuties();
}

//Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().

class Chef extends Person implements Worker{
    Chef(String name , int id){
        super(name , id);
    }
    @Override
    public void perfomDuties() {
        System.out.println("perform Chef duties with name "+ name + " id " + id);
    }
}
class Waiter extends Person implements Worker{
    Waiter(String name , int id){
        super(name , id);
    }
    @Override
    public void perfomDuties() {
        System.out.println("perform Waiter duties with name "+ name + " id " + id);
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Waiter w = new Waiter("Ramu" , 01);
        w.perfomDuties();
        Chef c = new Chef("Walter White",02);
        c.perfomDuties();
    }
}
