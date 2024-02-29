// JobService.java
package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Job;
import com.examly.springapp.repository.JobRepo;
@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;
    public boolean saveJob(Job job)
    {
        try{
            jobRepo.save(job);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public Job getByJobId(int jobId)
    {
        return jobRepo.findById(jobId).orElse(null);
    }
    public List<Job> getJobs()
    {
        return jobRepo.findAll();
    }

}
