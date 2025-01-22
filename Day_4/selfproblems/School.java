package selfproblems;
/*
Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.
*/
class Course{
    private String name;
    public String getName(){
        return this.name;
    }
    public Course(String name){
        this.name = name;
        System.out.println("Course created: " + this.name);
    }
}
class Student{
    private String name;
    private Course[] courses;
    public String getName(){
        return this.name;
    }
    //Model an association between Student and Course to show that students can enroll in multiple courses.
    public Student(String name, Course[] courses){
        this.name = name;
        this.courses = courses;
        System.out.println("Student created: " + this.name);
        for (Course c : courses) {
            System.out.println("Course enrolled: " + c.getName());
        }
    }
}
public class School{
    //Model an aggregation relationship between School and Student.
    // Because School has a reference to Student, but Student does not have a reference to School.
    // whole part relationship
    private Student[] students;
    public School(Student[] students){
        this.students = students;
        System.out.println("School created");
        for (Student s : students) {
            System.out.println("Student in school: " + s.getName());
        }
    }
    public void getStudents(){
        for (Student s : students) {
            System.out.println("Student in school: " + s.getName());
        }
    }
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("English");
        Student s1 = new Student("Saurabh", new Course[]{c1, c2});
        Student s2 = new Student("Nishant", new Course[]{c2, c3});
        Student s3 = new Student("Uday", new Course[]{c1, c3});
        Student[] students = {s1, s2, s3};
        School school = new School(students);
        school.getStudents();
    }
}
