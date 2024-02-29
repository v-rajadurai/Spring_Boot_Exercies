package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Course;
import com.example.springapp.service.CourseService;
import java.util.*;
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/api/course")
    public ResponseEntity<Course> postCourse(@RequestBody Course course)
    {
        if(courseService.saveCourse(course)==true)
        {
            return new ResponseEntity<>(course,HttpStatus.OK);
        }
        return new ResponseEntity<>(course,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> getCourseAll()
    {
        List<Course> a=courseService.getAll();
        if(a!=null)
        {
            return new ResponseEntity<List<Course>>(a,HttpStatus.OK);
        }
        return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<Course>> getfindCourseName(@PathVariable String courseName)
    {
        List<Course> b=courseService.getSearch(courseName);
        if(b!=null)
        {
            return new ResponseEntity<List<Course>>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
