package com.masai;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;

	@ManyToOne
	@JoinColumn(name = "collegeId")
	private College college;

	// Constructors, getters, and setters (omitted for brevity)
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String mobileNumber, String email, College college) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.college = college;
	}

	public Long getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(Long studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", college=" + college + "]";
	}

}