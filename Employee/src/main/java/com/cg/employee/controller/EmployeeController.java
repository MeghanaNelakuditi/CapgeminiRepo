package com.cg.employee.controller;

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

import com.cg.employee.dto.Employee;
import com.cg.employee.service.EmployeeService;


@RestController
@RequestMapping("/employee")
class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/getEmployees")
	public ResponseEntity<List<Employee>>getAllEmployees() {
		List<Employee> myList=service.getAllEmployees();
		if(myList.isEmpty()) {
			return new ResponseEntity("No Employee to show", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(myList,HttpStatus.OK);
		}
	

	@PostMapping("/addEmployee")
	public ResponseEntity addEmployee(@RequestBody Employee employee) {
		Employee employee1=service.addEmployee(employee);
		if(employee1==null) {
			return new ResponseEntity("Product not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee1,HttpStatus.OK);
	}
	@PutMapping("/updateEmployee")
	public ResponseEntity updateEmployee(@RequestBody Employee employee) {
		Employee employee1=service.updateEmployee(employee);
		if(employee1==null) {
			return new ResponseEntity("Product is not upated",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee1,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam("eid") Integer eid) {
		
		service.deleteEmployee(eid);
		
	}
	
	@GetMapping("/searchById")
	public ResponseEntity searchEmployeeById(@RequestParam("eid") Integer empId) {
		
		Employee employee = service.searchEmployeeById(empId);
		if(employee==null) {
			return new ResponseEntity("Product Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	@GetMapping("/searchByName")
	public ResponseEntity searchEmployeeByName(@RequestParam("ename") String empName) {
		
		Employee employee = service.searchEmployeeByName(empName);
		if(employee==null) {
			return new ResponseEntity("Product Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}

}
