package com.defect_tracker.DefectTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect_tracker.DefectTracker.model.Project;

import com.defect_tracker.DefectTracker.service.ProjectService;


@RestController
@CrossOrigin
@RequestMapping("/api/p1")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping(value = "/project")
	public ResponseEntity<?> createNote(@RequestBody Project project) {
		projectService.saveProject(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/project")
	  public List<Project> getEmployee() {
		return projectService.getAllProject();
	}
	
	@DeleteMapping("/project/{id}")
	public ResponseEntity<Long> deleteEmployee(@PathVariable Long id) {
		projectService.deleteProject(id);
	    return new ResponseEntity<>(id, HttpStatus.OK);
	}

	@PutMapping("/project/{id}")
	public ResponseEntity<Long> putProject(@PathVariable Project project) {
		projectService.putProject(project);
	    return new ResponseEntity<>( HttpStatus.OK);
	}

	
	
}
