package com.example.class_exercise_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_3.model.Student;

@RestController
public class StudentController {
    
    @GetMapping("/students")
    public Student greet()
    {
        Student obj=new Student(1, "John Doe", "this is student description");
        return obj;
    }
}
