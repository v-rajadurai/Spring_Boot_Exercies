package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.College;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class CollegeController {
   @GetMapping("/college")
   public College greet()
   {
    College obj=new College("ABC College", "Computer Science", 1);
    return obj;
   }
   
   
}
