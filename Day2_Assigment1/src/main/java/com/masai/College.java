package com.masai;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long collegeId;
	private String collegeName;
	private String collegeAddress;

	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Student> students = new HashSet<Student>();

	// Constructors, getters, and setters (omitted for brevity)
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeName, String collegeAddress) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ "]";
	}

}
