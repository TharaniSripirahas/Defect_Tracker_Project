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

import com.defect_tracker.DefectTracker.model.Defect;

import com.defect_tracker.DefectTracker.service.DefectService;


@RestController
@RequestMapping("/api/d1")
public class DefectController {
	
	@Autowired
	DefectService defectService;
	
	@PostMapping(value = "/defect")
	public ResponseEntity<?> createNote(@RequestBody Defect defect) {
		defectService.saveDefect(defect);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping("/defect")
	  public List<Defect> getEmployee() {
		return defectService.getAllDefect();
	}
	
	@DeleteMapping("/defect/{id}")
	public ResponseEntity<Long> deleteEmployee(@PathVariable Long id) {
		defectService.deleteDefect(id);
	    return new ResponseEntity<>(id, HttpStatus.OK);
	}
	

}
