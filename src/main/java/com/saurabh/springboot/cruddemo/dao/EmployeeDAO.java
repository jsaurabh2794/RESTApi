package com.saurabh.springboot.cruddemo.dao;

import java.util.List;

import com.saurabh.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public void addorUpdateEmployee(Employee emp);
	public String deleteEmployee(int empId);
	

}
