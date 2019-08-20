package com.cg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.employee.dao.Employeedao;
import com.cg.employee.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	Employeedao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployeeById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		
		// TODO Auto-generated method stub
		
		employeeDao.deleteEmployee(empId);
	}

	@Override
	public Employee searchEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployeeByName(empName);
	}
	
	
	

}
