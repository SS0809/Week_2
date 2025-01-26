package com.problems.employee;

//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
public class PartTimeEmployee extends Employee implements Department{

    int workHours;

    public int getPerHourRate() {
        return perHourRate;
    }

    public void setPerHourRate(int perHourRate) {
        this.perHourRate = perHourRate;
    }

    int perHourRate;
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    PartTimeEmployee(int employeeId, String name , int baseSalary , int work , int perday){
        super.setEmployeeId(employeeId);
        super.setName(name);
        super.setBaseSalary(baseSalary);
        this.setWorkHours(work);
        this.setPerHourRate(perday);
    }

    @Override
    public void assignDepartment(String dept) {
        this.setDepartment(dept);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department in Part time Employee: " +this.department);
    }
    @Override
    void calculateSalary(int percent){//TODO
        System.out.println("Salary calculated " +(this.baseSalary + (this.getPerHourRate() * this.getWorkHours()) )+ "\n");
    }
}
