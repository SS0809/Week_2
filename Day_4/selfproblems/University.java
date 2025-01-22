package selfproblems; 
/*
Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects.
 Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), 
 and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
*/
class Faculty{
    private String name;
    public String getName(){
        return this.name;
    }
    public Faculty(String name){
        this.name = name;
        System.out.println("Faculty created: " + this.name);
    }
}
class Department{
    private String name;
    private Faculty[] faculties;
    public String getName(){
        return this.name;
    }
    //model an aggregation relationship between Department and Faculty to show that faculties can exist independently of any specific department.
    public Department(String name, Faculty[] faculties){
        this.name = name;
        this.faculties = faculties;
        System.out.println("Department created: " + this.name);
        for (Faculty f : faculties) {
            System.out.println("Faculty in department: " + f.getName());
        }
    }
}
public class University{
    private Department[] departments;
    public University(Department[] departments){
        this.departments = departments;
        System.out.println("University created");
        for (Department d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }
    public void getDepartments(){
        for (Department d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Saurabh");
        Faculty f2 = new Faculty("Nishant");
        Faculty f3 = new Faculty("Uday");
        Department d1 = new Department("Math", new Faculty[]{f1, f2});
        Department d2 = new Department("Science", new Faculty[]{f2, f3});
        Department d3 = new Department("English", new Faculty[]{f1, f3});
        University u = new University(new Department[]{d1, d2, d3});
    }
}