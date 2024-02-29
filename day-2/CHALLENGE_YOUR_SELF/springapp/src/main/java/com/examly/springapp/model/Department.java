package com.examly.springapp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
@Component
public class Department {
    @JsonProperty("dept")
   @Value("BACHELOR OF TECHNOLOGY")
    private String department;
    @JsonProperty("branc")
    @Value("INFORMATION TECHNOLOGYYY")
    private String branch;
    
    public Department() {
    }
    public Department(String department, String branch) {
        this.department = department;
        this.branch = branch;
    }
    public String getdepartment() {
        return department;
    }
    public void setdepartment(String department) {
        this.department = department;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
}
