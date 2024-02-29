// JobController.java
package com.examly.springapp.controller;

import com.examly.springapp.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.service.JobService;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService=jobService;
    };
    @PostMapping("/api/job")
    public ResponseEntity<Job> postJob(@RequestBody Job job)
    {
        if(jobService.saveJob(job)==true)
        {
            return new ResponseEntity<>(job,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(job,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/jobs")
    public ResponseEntity<List<Job>> getjob()
    {
        List<Job> a=jobService.getJobs();
        if(a.size()<0)
        {
            return new ResponseEntity<List<Job>>(a,HttpStatus.NOT_FOUND);
            
        }
        return new ResponseEntity<>(a,HttpStatus.OK);
        
    }
    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<Job> getByJob(@PathVariable("jobId") int jobId)
    {
        Job b=jobService.getByJobId(jobId);
        if(b==null)
        {
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
            
        }
        return new ResponseEntity<>(b,HttpStatus.OK);
    }
    
}
