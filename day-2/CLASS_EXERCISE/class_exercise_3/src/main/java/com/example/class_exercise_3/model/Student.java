package com.example.class_exercise_3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    private long id;
    private String name;
    @JsonIgnore
    private String descripton;
    public Student() {
        
    }
    public Student(long id, String name, String descripton) {
        this.id = id;
        this.name = name;
        this.descripton = descripton;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescripton() {
        return descripton;
    }
    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
    

}
