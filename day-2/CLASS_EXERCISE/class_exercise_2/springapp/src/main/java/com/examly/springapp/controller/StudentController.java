package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Student;
@RestController
public class StudentController {
    @Autowired
    private Student obj; 
    @PostMapping("/students")

    public Student greet()
    {
        
        return obj;
    }
}
