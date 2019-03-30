package com.saurabh.springboot.cruddemo.rest;

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

import com.saurabh.springboot.cruddemo.entity.Employee;
import com.saurabh.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/Api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees()
	{
		return employeeservice.getAllEmployee();
	}
	
	@GetMapping("/Employees/{empId}")
	public Employee getEmployeeById(@PathVariable int empId)
	{
		return employeeservice.getEmployeeById(empId);
	}
	
	@PostMapping("/Employees")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		 employeeservice.addorUpdateEmployee(emp);
		 return emp;
	}
	@PutMapping("/Employees")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		employeeservice.addorUpdateEmployee(emp);
		return emp;
	}
	
	@DeleteMapping("/Employees/{empId}")
	public String deleteEmployee(@PathVariable int empId)
	{
		 
		 return employeeservice.deleteEmployee(empId);
	}

}
