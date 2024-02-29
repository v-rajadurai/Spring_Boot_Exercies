package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;
import java.util.*;
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
    public  List<Person> getAll()
    {
        return personRepo.findAll();
    }
    public List<Person> searchId(int age) 
    {
        return personRepo.findByAge(age);

    }

}
