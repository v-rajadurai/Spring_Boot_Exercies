package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Children;
import com.examly.springapp.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    private ChildrenRepo childrenRepo;
    public boolean saveChildren(Children children)
    {
        try{
            childrenRepo.save(children);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Children> childrenPaginateion(int offset,int pagesize)
    {
        return childrenRepo.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    public List<Children> childrenPaginateionList(String field)
    {
        return childrenRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<Children> childrenPaginateionSort(int offset,int pagesize,String field)
    {
        PageRequest pageRequest=PageRequest.of(offset,pagesize,Sort.Direction.ASC,field);
        Page<Children> p=childrenRepo.findAll(pageRequest);
        return p.getContent();
    }

    
}
