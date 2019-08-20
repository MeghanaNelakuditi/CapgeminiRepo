package com.cg.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.bean.Employee;
import com.cg.employee.service.EmployeeService;

@RestController
@RequestMapping("/emplist")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getEmployees",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> myList=employeeService.getEmployees();
		System.out.println(myList);
		if(myList.isEmpty()) {
			return new ResponseEntity("No Employee to show", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(myList,HttpStatus.OK);
		}
	@RequestMapping(value = "/addEmployee",method=RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		Employee employee=employeeService.addEmployee(emp);
		if(employee==null) {
			return new ResponseEntity("Data not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
        Employee employee = employeeService.updateEmployee(emp);
		if(employee==null) {
			return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	

	
	@RequestMapping(value = "/searchById",method=RequestMethod.GET)
    public ResponseEntity<Employee> getEmployeeById(@RequestParam("id") Integer employeeId)
       {
        Employee employee = employeeService.searchByEmployeeId(employeeId);
		if(employee==null) {
			return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	@DeleteMapping(value="/deleteById")
	public void deleteEmployee(@RequestParam("id") Integer empId) {
		employeeService.deleteEmployee(empId);
	}
}
