package com.examly.springapp.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Family;

@RestController
public class FamilyController {
    @GetMapping("/family")
    public List<Family> greet()
    {
        List<Family> obj=new ArrayList<>();
        Family a=new Family("John", 10, "friend");   
        Family b=new Family("pandi", 18, "brother");
        obj.add(a);   
        obj.add(b);
        return obj;   
     }
}
