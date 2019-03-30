package com.saurabh.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saurabh.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDaoJPAImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		Query query=entityManager.createQuery("from Employee"); //standard Jpa import javax.persistence.Query;
		List<Employee> theList=query.getResultList();
		return theList;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee emp=entityManager.find(Employee.class, empId);
		return emp;
	}

	@Override
	public void addorUpdateEmployee(Employee emp) {
		Employee dbEmployee=entityManager.merge(emp); //if id =0 then insert else update

		//to get updated id
		emp.setId(dbEmployee.getId());
	}

	@Override
	public String deleteEmployee(int empId) {
		Query query=entityManager.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId", empId);
		query.executeUpdate();
		return "Employee of Id: "+empId+ " is Deleted.";
	}

}
