package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Student;
import com.example.springapp.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/api/student")
    public ResponseEntity<Student> postStudent(@RequestBody Student student)
    {
        if(studentService.saveStudent(student)==true)
        {
            return new ResponseEntity<>(student,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(student,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/student")
    public ResponseEntity<List<Student>> postStudent(@RequestParam int offset,@RequestParam int pagesize)
    {
        List<Student> a=studentService.listPagination(offset, pagesize);
        if(a==null)
        {
            return new ResponseEntity<List<Student>>(a,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(a,HttpStatus.OK);
    }
    @GetMapping("/api/student/sort")
    public ResponseEntity<List<Student>> postStudent(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field)
    {
        List<Student> b=studentService.listPaginationSort(offset, pagesize,field);
    if(b==null)
        {
            return new ResponseEntity<List<Student>>(b,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(b,HttpStatus.OK);
    }
}
