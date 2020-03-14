package com.yetucommunications.Employees;

import java.util.List;

public interface EmployeeService {
	// contains methods to save, update and delete an employee
	
	
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Employee getEmployee(Long Id);
	
	void deleteEmployee(Long Id);
	

}
