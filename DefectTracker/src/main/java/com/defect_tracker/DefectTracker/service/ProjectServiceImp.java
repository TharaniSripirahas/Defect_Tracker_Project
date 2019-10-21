package com.defect_tracker.DefectTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.defect_tracker.DefectTracker.model.Project;
import com.defect_tracker.DefectTracker.repository.ProjectRepostories;

@Service
public class ProjectServiceImp implements ProjectService {
	
	@Autowired
	ProjectRepostories projectrepostories;
	
	@Override
	public void saveProject(Project project) {
		projectrepostories.save(project);		
	}
	
	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectrepostories.findAll();
	}
	
	@Override
	public boolean deleteProject(Long id) {
		projectrepostories.deleteById(id);
		return true;
	}

	@Override
	public void putProject(Project project) {
		projectrepostories.save(project);
		
	}

}
