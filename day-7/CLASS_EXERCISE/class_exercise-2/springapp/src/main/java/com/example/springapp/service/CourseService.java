package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Course;
import com.example.springapp.repository.CourseRepo;
import java.util.*;
@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public  boolean saveCourse(Course course)
    {
        try{
            courseRepo.save(course);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Course> getAll()
    {
        return courseRepo.findAll();
    }
    public List<Course> getSearch(String courseName)
    {
        return courseRepo.findByCourseName(courseName);
    }


}
