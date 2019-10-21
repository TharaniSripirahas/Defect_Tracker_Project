package com.defect_tracker.DefectTracker.service;

import java.util.List;

import com.defect_tracker.DefectTracker.model.Defect;

public interface DefectService {
	
	void saveDefect(Defect defect);
	List<Defect> getAllDefect();
	boolean deleteDefect(Long id);

}
