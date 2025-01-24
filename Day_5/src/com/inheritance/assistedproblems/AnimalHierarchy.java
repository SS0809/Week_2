/*
Animal Hierarchy
Description: 
Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and sound, and a method makeSound().

Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/

package com.inheritance.assistedproblems;


//Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
class Animal{
    //Define a superclass Animal with attributes name and sound, and a method makeSound().
    String name;
    String sound;
    Animal(String name , String sound){
        this.sound = sound;
        this.name = name;
    }
    void makeSound(){
        System.out.println(this.name + " makes a sounds");
    }
}

//Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
class Dog extends Animal{
    Dog(String name , String sound){
        super(name, sound);
    }
}
class Cat extends Animal{
    Cat(String name , String sound){
        super(name, sound);
    }
}
class Bird extends Animal{
    Bird(String name , String sound){
        super(name, sound);
    }
}

public class AnimalHierarchy {
    public static void main(String[] args){
        Animal al = new Animal("Animal" ,"Sound");
        Cat ct = new Cat("Kitty", "Meow");
        Dog dg = new Dog("Brono", "Barks");
        Bird bd = new Bird("BIrd", "Chirping");
        al.makeSound();
        ct.makeSound();
        dg.makeSound();
        bd.makeSound();
        System.out.println("hello");
    }
}