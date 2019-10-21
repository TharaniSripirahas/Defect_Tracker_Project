package com.defect_tracker.DefectTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect_tracker.DefectTracker.model.Employee;
import com.defect_tracker.DefectTracker.repository.EmployeeRepostories;


@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepostories employeerepostories;
	
	@Override
	public void saveEmployee(Employee employee) {
		employeerepostories.save(employee);		
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeerepostories.findAll();
	}
	
	@Override
	public boolean deleteEmployee(Long id) {
		employeerepostories.deleteById(id);
		return true;
	}

}
