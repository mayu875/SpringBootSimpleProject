package com.example.student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/myfamily")
	 public List<String> myFamilyList() {
		
	 List<String> str = Arrays.asList("Ishwar, Parvati, Mayuri, Mahesh");
		
		return str;
				
	}
}
