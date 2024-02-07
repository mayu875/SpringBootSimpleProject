package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloStudentController {

    @GetMapping("/hello")
     public String sendGreetings() {

     	return "Hello, Students...!";

	}
}
