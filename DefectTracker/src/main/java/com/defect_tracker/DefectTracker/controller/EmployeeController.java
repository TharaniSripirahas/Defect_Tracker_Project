package com.defect_tracker.DefectTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect_tracker.DefectTracker.model.Employee;
import com.defect_tracker.DefectTracker.service.EmployeeService;

@RestController
@RequestMapping("/api/e1")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "/employee")
	public ResponseEntity<?> createNote(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	
	  public List<Employee> getEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Long> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	    return new ResponseEntity<>(id, HttpStatus.OK);
	}
	

}
