package com.cg.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.employee.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
