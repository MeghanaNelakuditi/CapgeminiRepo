package com.cg.employee.service;

import java.util.List;

import com.cg.employee.dto.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees() ;
	public Employee addEmployee(Employee employee);
	public Employee searchEmployeeById(Integer empId);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Integer empId);
	public Employee searchEmployeeByName(String empName);
}
