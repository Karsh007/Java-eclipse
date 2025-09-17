package com.src.mn;

import java.util.Scanner;

import com.src.Model.Employee;
import com.src.service.EmployeeManagement;
import com.src.service.EmployeeOperations;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Using an interface reference to hold an object of the implementing class.
        EmployeeOperations empManager = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        int nextId = 1; // Simple auto-incrementing ID

        // Pre-populating with some data
        empManager.addEmployee(new Employee(nextId++, "Alice Johnson", 75000, "Engineering", "alice.j@example.com"));
        empManager.addEmployee(new Employee(nextId++, "Bob Williams", 62000, "Marketing", "bob.w@example.com"));

        int choice = 0; // Initialize choice to a non-exit value

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add New Employee");
            System.out.println("2. View an Employee's Details");
            System.out.println("3. Delete an Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. Get Total Number of Employees");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");

            // wrapper class
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Employee Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter Employee Email: ");
                    String email = scanner.nextLine();
                    Employee newEmployee = new Employee(nextId++, name, salary, dept, email);
                    empManager.addEmployee(newEmployee);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to view: ");
                    int viewId = Integer.parseInt(scanner.nextLine());
                    Employee empToView = empManager.viewEmployee(viewId);
                    if (empToView != null) {
                        System.out.println("\n--- Employee Found ---");
                        System.out.println(empToView);
                    } else {
                        System.out.println("Employee with ID " + viewId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    if (empManager.deleteEmployee(deleteId)) {
                        System.out.println("Employee with ID " + deleteId + " deleted successfully.");
                    } else {
                        System.out.println("Employee with ID " + deleteId + " not found.");
                    }
                    break;

                case 4:
                    empManager.viewAllEmployees();
                    break;

                case 5:
                    System.out.println("Total number of employees: " + empManager.getTotalEmployees());
                    break;

                case 6:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

