/*
Employee Management System
Description: Build an employee management system with the following requirements:

Use encapsulation to restrict direct access to fields and provide getter and setter methods.

Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

package com.problems.employee;



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(6523,"Saurabh",87000);
        FullTimeEmployee ft = (FullTimeEmployee) e1;// Down Cast
        Employee e2 = new PartTimeEmployee(6524,"Uday",87000 , 5 , 1500);
        PartTimeEmployee pt = (PartTimeEmployee) e2;// Down Cast
        System.out.println("Employee id : " + ft.getEmployeeId());
        System.out.println("Employee name : " + ft.getName());
        ft.assignDepartment("Mains");
        ft.getDepartmentDetails();
        ft.calculateSalary(8);
        System.out.println("Employee id : " + pt.getEmployeeId());
        System.out.println("Employee name : " + pt.getName());
        pt.assignDepartment("Excellence");
        pt.getDepartmentDetails();
        pt.calculateSalary(4);
    }
}