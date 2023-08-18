package com.masai.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.NoStudentFoundException;
import com.masai.model.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {
	private List<Student> studentList;

	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method.");
		studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "ABC", 95));
		studentList.add(new Student(2, "BCD", 85));
		studentList.add(new Student(3, "CDE", 75));
		studentList.add(new Student(4, "DEF", 65));
		studentList.add(new Student(5, "EFG", 55));
		studentList.add(new Student(6, "FGH", 45));
		studentList.add(new Student(7, "GHI", 35));
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent() {
		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
	}

	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollNo(@PathVariable int roll) {

		List<Student> list = studentList.stream().filter(s -> s.getRoll() == roll).toList();
		if (list.size() == 0) {
			throw new NoStudentFoundException("No student found by given ID : " + roll);
			// return new ResponseEntity<Student>(new Student(), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Student>(list.get(0), HttpStatus.OK);
	}

	@GetMapping("/byRange")
	public ResponseEntity<List<Student>> getStudentsByRange(int start, int end) {

		List<Student> list = studentList.stream().filter(s -> s.getMarks() >= start && s.getMarks() <= end).toList();
		if (list.size() == 0) {
			return new ResponseEntity<List<Student>>(new ArrayList<Student>(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);

	}

	@PostMapping("students")
	private ResponseEntity<String> registerStudent(@RequestBody Student st) {

		studentList.add(st);
		return new ResponseEntity<String>("Student added Successfully.", HttpStatus.CREATED);
	}

	@PutMapping("/students")
	public ResponseEntity<String> updateStudent(@RequestBody Student st) {

		Student stud = studentList.stream().filter(s -> s.getRoll() == st.getRoll()).toList().get(0);
		stud.setName(st.getName());
		stud.setMarks(st.getMarks());
		return new ResponseEntity<String>("Student updated Successfully.", HttpStatus.CREATED);

	}

	@PatchMapping("/students/{roll}")
	private ResponseEntity<String> updateByrollNo(@PathVariable int roll, @RequestBody Map<String, String> map) {
		Student stud = studentList.stream().filter(s -> s.getRoll() == roll).toList().get(0);

		if (map.get("name") != null) {
			stud.setName(map.get("name"));
		}
		if (map.get("marks") != null) {
			stud.setMarks(Integer.valueOf(map.get("marks")));
		}

		return new ResponseEntity<String>("Student updated Successfully.", HttpStatus.OK);
	}

	@DeleteMapping("/students/{roll}")
	private ResponseEntity<String> deleteStudent(@PathVariable int roll) {
		Student stud = studentList.stream().filter(s -> s.getRoll() == roll).toList().get(0);
		studentList.remove(stud);
		return new ResponseEntity<String>("Student Deleted Successfully with ID : " + roll, HttpStatus.OK);
	}

}
