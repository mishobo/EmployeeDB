package com.yetucommunications.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("yetucommunications/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
	return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
	return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployeeList();
	}
	
	@GetMapping("/by/id")
	public Employee getEmployee(@PathVariable(name ="Id") Long Id ) {
	return employeeService.getEmployee(Id);	
	}
	
	@DeleteMapping("delete/by/id")
	public void deleteEmployee(@PathVariable(name="Id") Long Id) {
		employeeService.deleteEmployee(Id);
	}
}
