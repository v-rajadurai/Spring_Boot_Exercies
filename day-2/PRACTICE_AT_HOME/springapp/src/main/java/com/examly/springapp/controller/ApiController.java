package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.config.AppConfig;

@RestController
public class ApiController {
    @Autowired
    private AppConfig obj;
    @GetMapping("/info")
    public String greet()
    {
        return "Student Name:"+ obj.getStudentName() +", Department:"+ obj.getStudentDepartment();
    }
}
