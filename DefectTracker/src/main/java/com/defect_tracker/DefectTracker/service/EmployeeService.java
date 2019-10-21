package com.defect_tracker.DefectTracker.service;

import java.util.List;

import com.defect_tracker.DefectTracker.model.Employee;



public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	boolean deleteEmployee(Long id);

}
