package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Student;
import com.example.springapp.service.StudentService;
import java.util.*;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public Student postStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getAlllll();
    }

}
