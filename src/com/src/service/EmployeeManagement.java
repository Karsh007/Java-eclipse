package com.src.service;
import java.util.ArrayList;
import java.util.List;

import com.src.Model.Employee;


public class EmployeeManagement implements EmployeeOperations {

    // Using a List to store employee objects in memory
    private List<Employee> employeeList;

    public EmployeeManagement() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added successfully: " + emp.getEmpName());
    }

    @Override
    public boolean deleteEmployee(int empId) {
        Employee employeeToRemove = null;
        // Iterate through the list to find the employee to remove
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == empId) {
                employeeToRemove = emp;
                break; // Exit the loop once found
            }
        }

        // If an employee was found, remove them from the list
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            return true; // Indicate success
        }
        return false; // Indicate that no employee was found/removed
    }

    @Override
    public Employee viewEmployee(int empId) {
        // Iterate through each employee in the list
        for (Employee emp : employeeList) {
            // Check if the current employee's ID matches the one we're looking for
            if (emp.getEmpId() == empId) {
                return emp; // Found the employee, so we return it
            }
        }
        // If the loop completes without finding a match, return null
        return null;
    }

    @Override
    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\n--- All Employee Records ---");
        for (Employee emp : employeeList) {
            System.out.println(emp);
            System.out.println("-----------");
        }
    }



    @Override
    public int getTotalEmployees() {
        return employeeList.size();
    }
}
