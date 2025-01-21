/*
Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:

*/
public class Student{
    // Static:
    // A static variable universityName shared across all students.
    // A static method displayTotalStudents() to show the number of students enrolled.
    static String universityName = "TIT";
    static int totalStudents;
    static int displayTotalStudents(){
        return totalStudents;
    }    
    // This:
    // Use this in the constructor to initialize name, rollNumber, and grade.
    private String name, grade;
    // Final:
    // Use a final variable rollNumber for each student that cannot be changed.
    private final int rollNumber;
    Student(String name , String grade, int rollNumber){
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }
    
    // Instanceof:
    // Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
    private boolean checkInstance(){
        if(this instanceof Student){
            return true;
        }else{
            return false;
        }
    }
    private void displayStudentDetails(){
        if(this.checkInstance()){
            System.out.println("name : " + name);
            System.out.println("grade : " + grade);
            System.out.println("rollNumber : "+ rollNumber);
            System.out.println("universityName : "+ universityName);
        }
    }
    private void updateStudentDetails(String name , String grade){
        if(this.checkInstance()){
            this.name = name;
            this.grade = grade;
            System.out.println("updated name : " + name);
            System.out.println("updated grade : " + grade);
            System.out.println("updated rollNumber : "+ rollNumber);
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Saurabh Saraswat", "A" , 5610231);
        Student st2 = new Student("Uday Deshmukh", "B" , 5611531);
        st1.displayStudentDetails();
        st1.updateStudentDetails("Saurabh Saraswat", "A+");
        st1.displayStudentDetails();
        st2.displayStudentDetails();
        st2.updateStudentDetails("Uday Deshmukh", "B+" );
        st2.displayStudentDetails();
    }
}