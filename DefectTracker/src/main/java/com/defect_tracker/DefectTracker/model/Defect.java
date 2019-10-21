package com.defect_tracker.DefectTracker.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "defect")
public class Defect {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Defect_id")
	private Long id;
	private String name;
	private String priority;
	private String severity;	
	private String status;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="Projec_id", referencedColumnName = "Projec_id")
	private Project project;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="Emp_id", referencedColumnName = "Emp_id")
	private Employee employee;

	public Defect(Long id, String name, String priority, String severity, String status, Project project,
			Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
		this.severity = severity;
		this.status = status;
		this.project = project;
		this.employee = employee;
	}

	public Defect(String name, String priority, String severity, String status, Project project, Employee employee) {
		super();
		this.name = name;
		this.priority = priority;
		this.severity = severity;
		this.status = status;
		this.project = project;
		this.employee = employee;
	}

	public Defect() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

}
