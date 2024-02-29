package com.example.springapp.service;

import org.aspectj.weaver.bcel.ExceptionRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Student;
import com.example.springapp.repository.StudentRepo;
import java.util.*;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public Student saveStudent(Student student)
    {
        
            return studentRepo.save(student);
            
    }
    public List<Student> getAlllll()
    {
        return studentRepo.findAll();
    }
}
