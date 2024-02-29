package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.Student;
import com.example.springapp.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public boolean saveStudent(Student student)
    {
        try{
            studentRepo.save(student);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Student> listPagination(int offset,int pagesize)
    {
        return studentRepo.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    public List<Student> listPaginationSort(int offset,int pagesize,String field)
    {
        PageRequest pageRequest=PageRequest.of(offset, pagesize,Sort.Direction.ASC,field);
        List<Student> a=studentRepo.findAll(pageRequest).getContent();
        return a;
    }

}
