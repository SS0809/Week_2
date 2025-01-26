package com.problems.employee;

//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
public class FullTimeEmployee extends Employee implements Department{
    FullTimeEmployee(int employeeId, String name , int baseSalary){
        super.setEmployeeId(employeeId);
        super.setName(name);
        super.setBaseSalary(baseSalary);
    }
    @Override
    void calculateSalary(int percent){
        System.out.println("Salary calculated " +this.baseSalary * 2 + "\n");
    }

    @Override
    public void assignDepartment(String dept) {
        this.setDepartment(dept);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department in Full time Employee: " + this.department);
    }
}
