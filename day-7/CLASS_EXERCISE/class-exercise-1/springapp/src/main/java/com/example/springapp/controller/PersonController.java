package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Person;
import com.example.springapp.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/api/person")
    public ResponseEntity<Person> postPerson(@RequestBody Person person)
    {
        if(personService.savePerson(person)==true)
        {
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(person,HttpStatus.INTERNAL_SERVER_ERROR);        
    }
    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getPerson()
    {
        List<Person> b=personService.getAll();
        if(b!=null)
        {
            return new ResponseEntity<List<Person>>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);        
    }
    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<Person>> getPersonforSearch(@RequestParam int age)
    {
        List<Person> c=personService.searchId(age);
        if(c!=null)
        {
            return new ResponseEntity<List<Person>>(c,HttpStatus.OK);
        }
        return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);        
    }

}
