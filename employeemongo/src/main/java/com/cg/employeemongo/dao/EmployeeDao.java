package com.cg.employeemongo.dao;

import java.util.List;

import com.cg.employeemongo.dto.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmplpoyees() ;
	public Employee addEmployee(Employee employee);
	public Employee searchEmployeeById(Integer empId);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Integer empId);


}
