package com.src.service;

import com.src.Model.Employee;

public interface EmployeeOperations {
	
	    void addEmployee(Employee emp);
	    boolean deleteEmployee(int empId);
	    Employee viewEmployee(int empId);
	    void viewAllEmployees();
	    int getTotalEmployees();
}
