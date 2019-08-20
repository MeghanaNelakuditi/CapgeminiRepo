package com.cg.employee.service;

import java.util.List;
import java.util.Optional;

import com.cg.employee.bean.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public Employee addEmployee(Employee emp);
	public Employee searchByEmployeeId(Integer employeeId);
	public void deleteEmployee(Integer empId);
	public Employee updateEmployee(Employee emp);


}
