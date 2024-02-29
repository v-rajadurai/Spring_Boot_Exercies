package com.example.springapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {
    @Id
    private int id;
    private String schoolName;
    @JsonManagedReference
    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Student> student;
}
