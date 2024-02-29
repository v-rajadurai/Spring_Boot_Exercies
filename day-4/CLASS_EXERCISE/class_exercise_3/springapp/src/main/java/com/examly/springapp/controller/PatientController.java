package com.examly.springapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Patient;
import com.examly.springapp.services.PatientServices;

@RestController
@RequestMapping("/api")
public class PatientController {
    
    private PatientServices patientServices;
    public PatientController(PatientServices patientServices)
    {
        this.patientServices = patientServices;
    }

    @PostMapping("/patient")
    public ResponseEntity<Patient> addData(@RequestBody Patient patient)
    {
        if(patientServices.addPatient(patient))
        {
            return new ResponseEntity<Patient>(patient, HttpStatus.CREATED);
        }
        else{
            System.out.println("Cannot add Object");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getList()
    {
        List<Patient> patients = patientServices.getPatients();
        if(patients.size() > 0)
        {
            return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<Patient> getpatientById(@PathVariable int patientId){
        Patient patient = patientServices.getPatientById(patientId);
        if(patient != null)
        {
            return new ResponseEntity<Patient>(patient, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}