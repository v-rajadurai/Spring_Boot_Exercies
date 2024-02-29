package com.examly.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Patient;
import com.examly.springapp.repository.PatientRepo;

@Service
public class PatientServices {
    
    @Autowired
    private PatientRepo patientRepo;

    public boolean addPatient(Patient patient)
    {
        try{
            patientRepo.save(patient);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Patient> getPatients()
    {
        return patientRepo.findAll();
    }

    public Patient getPatientById(int patientId)
    {
        return patientRepo.findById(patientId).orElse(null);
    }
}