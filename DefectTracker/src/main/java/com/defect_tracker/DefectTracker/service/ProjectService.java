package com.defect_tracker.DefectTracker.service;

import java.util.List;

import com.defect_tracker.DefectTracker.model.Project;

public interface ProjectService {
	
	void saveProject(Project project);
	List<Project> getAllProject();
	boolean deleteProject(Long id);
	void putProject(Project project);
	

}
