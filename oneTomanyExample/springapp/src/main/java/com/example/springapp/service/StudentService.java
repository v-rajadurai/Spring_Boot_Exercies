package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Student;
import com.example.springapp.model.StudentInfo;
import com.example.springapp.repository.StudentInfoRepo;
import com.example.springapp.repository.StudentRepo;
import java.util.*;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentInfoRepo studentInfoRepo;

    public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }

    public StudentInfo saveStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepo.save(studentInfo);
    }

    public List<StudentInfo> getAllStudent()
    {
        return studentInfoRepo.findAll();
    }
    



}
