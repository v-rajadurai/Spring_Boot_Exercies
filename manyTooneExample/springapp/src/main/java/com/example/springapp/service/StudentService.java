package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.School;
import com.example.springapp.model.Student;
import com.example.springapp.repository.SchoolRepo;
import com.example.springapp.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }

    @Autowired
    private SchoolRepo schoolRepo;
    public School saveSchool(School school)
    {
        return schoolRepo.save(school);
    }


    public List<Student> getStudentAll()
    {
        return studentRepo.findAll();
    }
    public List<School> getSchoolAll()
    {
        return schoolRepo.findAll();
    }
}
