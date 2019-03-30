package com.saurabh.springboot.cruddemo.service;

import java.util.List;

import com.saurabh.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public void addorUpdateEmployee(Employee emp);
	public String deleteEmployee(int empId);
}
