package com.defect_tracker.DefectTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect_tracker.DefectTracker.model.Defect;
import com.defect_tracker.DefectTracker.repository.DefectRepostories;

@Service
public class DefectServiceImp implements DefectService {
	
	@Autowired
	DefectRepostories defectrepostories;
	
	@Override
	public void saveDefect(Defect defect) {
		defectrepostories.save(defect);		
	}
	
	@Override
	public List<Defect> getAllDefect() {
		// TODO Auto-generated method stub
		return defectrepostories.findAll();
	}
	
	@Override
	public boolean deleteDefect(Long id) {
		defectrepostories.deleteById(id);
		return true;
	}



}
