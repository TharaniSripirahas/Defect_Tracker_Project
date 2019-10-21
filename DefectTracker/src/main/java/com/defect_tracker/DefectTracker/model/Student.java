package com.defect_tracker.DefectTracker.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;	

	@Entity
	@Table(name = "student")
	public class Student {
		
		//private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="student_id")
		private int id;
		@Column(name="student_name")
		private String name;
		private String contact;
		
		@OneToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "laptop_id", referencedColumnName = "laptop_id")
		private Laptop laptop;

		public Student(int id, String name, String contact, Laptop laptop) {
			super();
			this.id = id;
			this.name = name;
			this.contact = contact;
			this.laptop = laptop;
		}

		public Student(String name, String contact, Laptop laptop) {
			super();
			this.name = name;
			this.contact = contact;
			this.laptop = laptop;
		}

		public Student() {
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

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Laptop getLaptop() {
			return laptop;
		}

		public void setLaptop(Laptop laptop) {
			this.laptop = laptop;
		}
		
		

}
