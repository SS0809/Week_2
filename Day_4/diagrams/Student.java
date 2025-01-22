package diagrams;

import java.util.ArrayList;

/*
Sample Problem 1: School Results Application
Class Diagram
The class diagram represents the structure of a school results application where students have subjects, and their scores are calculated for grades.
Diagram Description:
Classes: Student, Subject, GradeCalculator
Relationships:
A Student has multiple Subject entries (Aggregation).
GradeCalculator computes the results for a Student.
→ Draw the Class Diagram

Object Diagram
An object diagram provides a snapshot of the Student and their Subject objects at a particular point.
Example:
Student: John
Subjects: Maths, Science
Marks: 90, 85
→ Draw the Object Diagram

Sequence Diagram
The sequence diagram shows how objects interact to calculate grades.
Scenario: A student requests their grade based on marks in subjects.
Actors:
Student
GradeCalculator
*/
class GradeCalculator{
    public static String calculateGrade(Student student){
        int total = 0;
        for(Subject subject : student.getSubjects()){
            total += subject.marks;
        }
        int average = total / student.getSubjects().size();
        String adde = "Grade is : ";
        if(average >= 90){
            return adde + "A";
        }else if(average >= 80){
            return adde + "B";
        }else if(average >= 70){
            return adde + "C";
        }else if(average >= 60){
            return adde + "D";
        }else{
            return adde + "F";
        }
    }
}
class Subject{
    String name;
    int marks;
    Subject(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Student{
    private static ArrayList<Subject> subjects = new ArrayList<Subject>();
    private String name;
    private int rollNumber;
    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("Student Name: " + name + " , Roll Number: " + rollNumber);
    }
    public ArrayList<Subject> getSubjects(){
        return subjects;
    }
    public static void main(String[] args) {
        subjects.add(new Subject("Maths" , 90));
        subjects.add(new Subject("Chemistry" , 78));
        subjects.add(new Subject("Physics" , 85));
        System.out.println(GradeCalculator.calculateGrade(new Student("Saurabh", 211163)));
    }
}