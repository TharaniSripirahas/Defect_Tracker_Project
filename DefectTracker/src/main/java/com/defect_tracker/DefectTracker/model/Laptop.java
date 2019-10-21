package com.defect_tracker.DefectTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="laptop_id")
	private int id;
	@Column(name="laptop_name")
	private String name;
	private String serialNo;
	
	@OneToOne(mappedBy = "laptop")
    private Student student;

	public Laptop(int id, String name, String serialNo, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.serialNo = serialNo;
		this.student = student;
	}

	public Laptop(String name, String serialNo, Student student) {
		super();
		this.name = name;
		this.serialNo = serialNo;
		this.student = student;
	}

	public Laptop() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
