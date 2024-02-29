package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Department;

@RestController
public class DepartmentController {
    // @Autowired
    // private Department obj;
    @GetMapping("/department")
    public String greet()
    {
        Department obj = new Department("BACHELOR OF TECHNOLOGY","INFORMATION TECHNOLOGYYY");
        return "Department name: "+obj.getdepartment()+", Branch: "+obj.getBranch();
    }
}
