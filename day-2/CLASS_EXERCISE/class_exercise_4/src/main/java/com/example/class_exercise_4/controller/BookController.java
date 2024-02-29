package com.example.class_exercise_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_4.model.Book;
@RestController
public class BookController {
    
    @Autowired
    public Book b;
    @GetMapping("/today")
    public Book greet()
    {
        // Book a=new Book("The Great Soldier", "G.Gyan");
        return b;
    }
}
