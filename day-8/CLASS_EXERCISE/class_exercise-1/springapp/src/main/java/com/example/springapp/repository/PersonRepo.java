package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.springapp.model.Person;
import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{


    // @Query
    List<Person> findByNameStartsWith(String name);
    List<Person> findByNameEndsWith(String name);
} 