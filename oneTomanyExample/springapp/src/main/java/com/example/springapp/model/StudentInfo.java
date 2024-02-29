package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentInfo {
    @Id
    private int id;
    private String email;
    private int reg;
    
    @JsonBackReference
    @OneToOne(cascade=CascadeType.ALL)
    private Student student;
    
}
