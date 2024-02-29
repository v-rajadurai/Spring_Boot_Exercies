package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.School;
import com.example.springapp.service.StudentService;

@RestController
public class SchoolController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/school")
    public School postSchool(@RequestBody School school)
    {
        return studentService.saveSchool(school);
    }

    @GetMapping("/schools")
    public List<School> getSchoolAll()
    {
        return studentService.getSchoolAll();
    }
}
