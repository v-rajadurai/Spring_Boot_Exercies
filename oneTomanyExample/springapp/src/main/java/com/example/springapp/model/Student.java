package com.example.springapp.model;

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
public class Student {
    @Id
    private int id;
    private String name;
    
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private StudentInfo studentInfo;

}
