package com.saurabh.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saurabh.springboot.cruddemo.dao.EmployeeDAO;
import com.saurabh.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("employeeDaoJPAImpl")
	private EmployeeDAO employeedao;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		
		return employeedao.getAllEmployee();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int empId) {
		
		return employeedao.getEmployeeById(empId);
	}

	@Override
	@Transactional
	public void addorUpdateEmployee(Employee emp) {
		
		employeedao.addorUpdateEmployee(emp);
	}

	@Override
	@Transactional
	public String deleteEmployee(int empId) {
		return employeedao.deleteEmployee(empId);
	}

}
