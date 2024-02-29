package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;
    public boolean savePerson(Person person)
    {
        try{
            personRepo.save(person);
            return true;
        }
        catch(Exception e)
        {
            return true;

        }
    }
    public List<Person> getAllStart(String value)
    {
        return personRepo.findByNameStartsWith(value);
    }
    public List<Person> getAllEnd(String value)
    {
        return personRepo.findByNameEndsWith(value);
    }
}
