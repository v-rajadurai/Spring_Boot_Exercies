package com.example.class_exercise_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.class_exercise_1.config.AppConfig;

public class ApiController {
     @Autowired
    private AppConfig obj;
    @GetMapping("/path")
    public String greet()
    {
        return "App Name: "+obj.getAppName()+", Version: "+obj.getAppVersion();
    }
}
