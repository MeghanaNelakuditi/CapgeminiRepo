package com.cg.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.employee.dto.Employee;


@Repository
public class EmployeedaoImpl  implements Employeedao{

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		return  mongoTemplate.findAll(Employee.class);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return mongoTemplate.insert(employee);
	}

	@Override
	public Employee searchEmployeeById(Integer id) {
		
		Query query=Query.query(Criteria.where("empId").is(id));
		return mongoTemplate.findOne(query,Employee.class);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		mongoTemplate.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer empId) {
		System.out.println("hiii"+empId);
		Employee employee=mongoTemplate.findById(empId,Employee.class);
		System.out.println("service"+employee);
		mongoTemplate.remove(employee);
	}

	@Override
	public Employee searchEmployeeByName(String name) {
		Query query=Query.query(Criteria.where("empName").is(name));
		return mongoTemplate.findOne(query,Employee.class);
	}

}
