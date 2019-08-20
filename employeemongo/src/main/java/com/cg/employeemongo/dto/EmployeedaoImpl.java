package com.cg.employeemongo.dto;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.employeemongo.dao.EmployeeDao;

@Repository
public class EmployeedaoImpl implements EmployeeDao {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Employee> getAllEmplpoyees() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Employee.class);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return mongoTemplate.insert(employee);
	}

	@Override
	public Employee searchEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
	Query query=Query.query(Criteria.where("empSalary").gte(50000));
	Employee employee=mongoTemplate.findOne(query, Employee.class);
	return employee;
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		mongoTemplate.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer empId) {
	
		Employee employee=mongoTemplate.findById(empId,Employee.class);
		mongoTemplate.remove(employee);
	
	
	}

}
