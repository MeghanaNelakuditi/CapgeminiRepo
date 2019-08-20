package com.cg.employeemongo.service;

import java.util.List;

import com.cg.employeemongo.dto.Employee;

public interface Employeeservice {
	
	public List<Employee> getAllEmplpoyees() ;
	public Employee addEmployee(Employee employee);
	public Employee searchEmployeeById(Integer empId);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Integer empId);
	
}
