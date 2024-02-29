package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer>
{
    
} 