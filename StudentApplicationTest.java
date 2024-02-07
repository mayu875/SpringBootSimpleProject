package com.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.student.controller.HelloStudentController;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class StudentApplicationTest {

    @Autowired
     private HelloStudentController helloStudentController;

    @Test
     void contextLoads() {
      	// to ensure that controller is getting created inside the application context
      	assertNotNull(helloStudentController);

	}
}
