  package com.src.Model;
public class Employee {
    // Private attributes to hide data
    private int empId;
    private String empName;
    private double empSalary;
    private String empDepartment;
    private String empEmail;

    // Constructor to initialize the Employee object
    public Employee(int empId, String empName, double empSalary, String empDepartment, String empEmail) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
        this.empEmail = empEmail;
    }

    // Public getter methods to access the private data
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    // Public setter methods to modify the private data
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    // Overriding toString() for a user-friendly representation of the object
    @Override
    public String toString() {
        return "Employee Details:\n" +
               "  ID: " + empId + "\n" +
               "  Name: " + empName + "\n" +
               "  Salary: $" + String.format("%.2f", empSalary) + "\n" +
               "  Department: " + empDepartment + "\n" +
               "  Email: " + empEmail;
    }
}