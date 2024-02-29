package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String city;
    @JsonBackReference
    @JoinColumn(name="school_id")
    @ManyToOne
    private School school;
}
