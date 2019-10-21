package com.defect_tracker.DefectTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect_tracker.DefectTracker.model.Defect;

@Repository
public interface DefectRepostories extends JpaRepository<Defect, Long> {

}
