// JobRepo.java
package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job ,Integer>{

    
} 
