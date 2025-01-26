package com.problems.employee;

public abstract class Employee {
        //Use an abstract class Employee with fields like employeeId, name, and baseSalary.
        int employeeId;
        String name;

        public String getDepartment() {
                return department;
        }

        public void setDepartment(String department) {
                this.department = department;
        }

        String department;
        int baseSalary;
        public int getBaseSalary() {
                return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
                this.baseSalary = baseSalary;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getEmployeeId() {
                return employeeId;
        }

        public void setEmployeeId(int employeeId) {
                this.employeeId = employeeId;
        }

        //Provide an abstract method calculateSalary() and a concrete method displayDetails().
        abstract void calculateSalary(int percent);
        void displayDetails(){
            System.out.println("Employee Id "+ this.employeeId + "\nName "+ this.name + "\nBase salary "+ this.baseSalary);
        }
}
