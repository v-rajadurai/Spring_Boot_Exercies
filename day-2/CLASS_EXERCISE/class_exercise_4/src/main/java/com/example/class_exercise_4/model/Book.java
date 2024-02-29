package com.example.class_exercise_4.model;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
@Component
public class Book {
    @Value("The Great Soldier")
    private String title;
    @Value("G.Gyan")
    private String author;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD")
    private Date publicationDate;
    
    public Book() {
        this.publicationDate=new Date();
    }
    public Book(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    
}
