package com.cg.employeemongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeemongo.dto.Employee;
import com.cg.employeemongo.service.Employeeservice;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@Autowired
	Employeeservice employeeService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Employee>> getAllEmplpoyees() {
		List<Employee> myList=employeeService.getAllEmplpoyees();
		if(myList.isEmpty()) {
			return new ResponseEntity("No Employee to show", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(myList,HttpStatus.OK);
		}
	
	
	@PostMapping("/addEmployee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		Employee emp=employeeService.addEmployee(employee);
		if(emp==null) {
			return new ResponseEntity("Data not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}

	@PutMapping("/updateAll")
	public ResponseEntity updateEmployee(@RequestBody Employee employee) {
		Employee emp=employeeService.updateEmployee(employee);
		if(emp==null) {
			return new ResponseEntity("Data is not upated",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam("eid") Integer empId) {
		employeeService.deleteEmployee(empId);
		
	}
	
	@GetMapping("/searchById")
	public ResponseEntity searchEmployeeById(@RequestParam("eid") Integer empId) {
		
		Employee employee = employeeService.searchEmployeeById(empId);
		if(employee==null) {
			return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(HttpStatus.OK);
		
	}
}
