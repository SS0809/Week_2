/*

Sample Program 3: Employee Management System
Design an Employee class with the following features:




*/
public class Employee{
    static String companyName;
    static int totalEmployee = 0;
    // Static:
    // A static variable companyName shared by all employees.
    // A static method displayTotalEmployees() to show the total number of employees.
    static int displayTotalEmployees(){
        return totalEmployee;
    }
    private String name , designation;
    // Final:
    // Use a final variable id for the employee ID, which cannot be modified after assignment.
    private final int id ;
    // This:
    // Use this to initialize name, id, and designation in the constructor.   
    Employee(String name , int id , String designation){
        this.name = name ;
        this.id = id;
        this.designation = designation;
    }
    private void displayAccountDetails(){
        if(this instanceof Employee){
            System.out.println("name : " + name);
            System.out.println("Id: " + id);
            System.out.println("Designation : "+ designation);
        }
    }
    public static void main(String[] args) {
        Employee em1 = new Employee("Saurabh", 1530 , "Senior Engg");
        Employee em2 = new Employee("Uday", 1531 , "Senior Engg");
        em1.displayAccountDetails();
        em2.displayAccountDetails();
    }
}