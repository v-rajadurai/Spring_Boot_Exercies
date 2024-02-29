package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Children;
import com.examly.springapp.repository.ChildrenRepo;
import com.examly.springapp.service.ChildrenService;

@RestController
public class ChildrenController {
    @Autowired
    private ChildrenService childrenService;
    @PostMapping("/api/children")
    public ResponseEntity<Children> postChildren(@RequestBody Children children)
    {
        if(childrenService.saveChildren(children)==true)
        {

            return new ResponseEntity<>(children,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(children,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<Children>> sortChildren(@PathVariable String field)
    {
        List<Children> a=childrenService.childrenPaginateionList(field);
        if(a!=null)
        {

            return new ResponseEntity<List<Children>>(a,HttpStatus.OK);
        }
        return new ResponseEntity<>(a,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<List<Children>> sortChildren(@PathVariable int offset,@PathVariable int pagesize)
    {
        List<Children> b=childrenService.childrenPaginateion(offset,pagesize);
        if(b!=null)
        {
            return new ResponseEntity<List<Children>>(b,HttpStatus.OK);
            
        }
        return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Children>> sortChildren(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        List<Children> c=childrenService.childrenPaginateionSort(offset,pagesize,field);
        if(c!=null)
        {

            return new ResponseEntity<List<Children>>(c,HttpStatus.OK);
        }
        return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);
    }
}
