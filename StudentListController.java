package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;

@RestController
public class StudentListController {

	@GetMapping("/getstudent")
	 public List<Student> getStudentControllerList() {
		
	 List<Student> studList = new ArrayList<Student>();
		
	 Student stud1 = new Student();
		
	 stud1.setStudId("1");
	 stud1.setStudName("Mayuri");
	 stud1.setStudContact("7057299515");
	 stud1.setStudAddress("Kolhapur");
		
	 studList.add(stud1);

	 Student stud2 = new Student();
		
	 stud2.setStudId("2");
	 stud2.setStudName("Pooja");
	 stud2.setStudContact("88349567258");
	 stud2.setStudAddress("Pune");
		
	 studList.add(stud2);

	 return studList;
		
	}
}