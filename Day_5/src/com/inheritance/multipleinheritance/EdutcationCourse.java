/*
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:



Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
*/
package com.inheritance.multipleinheritance;

class Course{
//    Define a superclass Course with attributes like courseName and duration.
    String courseName;
    int duration;
    Course(String courseName , int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    void getDetails(){
        String[] parts  = this.getClass().getName().toString().split("\\.");
        System.out.println("\n"+ parts[3]+"\nCourse name "+ courseName + "\nDuration "+ duration);
    }
}
class OnlineCourse extends Course{
//    Define OnlineCourse to add attributes such as platform and isRecorded.
    String platform ;
    Boolean isRecorded;
    OnlineCourse(String platform , Boolean isRecorded , String courseName , int duration){
        super(courseName,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("PLatform "+ platform + "\nIs recorded "+ isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
//    Define PaidOnlineCourse to add fee and discount.
    int fee;
    int discount;
    PaidOnlineCourse(int fee , int discount , String platform , Boolean isRecorded , String courseName , int duration){
        super(platform ,  isRecorded , courseName , duration);
        this.platform = platform;
        this.discount = discount;
    }
    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("Discount "+ discount + "\nFee "+ fee);
    }
}
public class EdutcationCourse {
    public static void main(String[] args) {
        Course c = new Course("JAVA" , 950);
        c.getDetails();
        OnlineCourse oc = new OnlineCourse("ONline Zoom",true,"JAVA" , 950);
        oc.getDetails();
        PaidOnlineCourse poc = new PaidOnlineCourse(56000, 10,"ONline Zoom",true,"JAVA" , 950);
        poc.getDetails();
    }
}
