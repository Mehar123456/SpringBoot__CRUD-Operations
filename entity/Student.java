package com.example.demoForJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String StudentName;
	private String studentEmail;
	private String StudentAddress;
	@Override
	public String toString() {
		return "student [id=" + id + ", StudentName=" + StudentName + ", studentEmail=" + studentEmail
				+ ", StudentAddress=" + StudentAddress + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String studentName, String studentEmail, String studentAddress) {
		super();
		this.id = id;
		StudentName = studentName;
		this.studentEmail = studentEmail;
		StudentAddress = studentAddress;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
}
