package assistedproblems;
/*
Problem 3: Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, 
where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
*/

class Employee{
    private int id;
    public int getId(){
        return this.id;
    }
    public Employee(int id){
        this.id = id;
        System.out.println("Employee created " + this.id);
    }
}
class Department{
    private String name;
    private Employee[] employees;
    public void getName(){
        System.out.println("Department name: " + this.name);
    }
    public Department(Employee[] employees , String name){
        this.name = name;
        this.employees = employees;
        System.out.println("Department created " + this.name);
        for (Employee e : employees) {
            System.out.println("Employee in department: " + e.getId());
        }
    }
}
public class Company{
    private Department[] departments;
    public Company(Department[] departments){
        this.departments = departments;
        System.out.println("Company created with departments:");
        for (Department d : departments) {
            d.getName();
        }
    }
    public static void main(String[] args) {
        Department d = new Department(new Employee[]{new Employee(1)}, "IT");
        Department d1 = new Department(new Employee[]{new Employee(2), new Employee(3)}, "HR");
        Company c = new Company(new Department[]{d, d1});
        System.out.println("--------------------------------------");
    }
}