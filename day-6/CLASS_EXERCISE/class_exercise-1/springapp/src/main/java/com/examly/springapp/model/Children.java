package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Children {
   @Id
    private int bodyId;
    private String bodyFirstName;
    private String bodyLastName;
    private String fatherName;
    private String motherName;
    private String address;
    public Children() {
    }
    public Children(int bodyId, String bodyFirstName, String bodyLastName, String fatherName, String motherName,
            String address) {
        this.bodyId = bodyId;
        this.bodyFirstName = bodyFirstName;
        this.bodyLastName = bodyLastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
    }
    public int getBodyId() {
        return bodyId;
    }
    public void setBodyId(int bodyId) {
        this.bodyId = bodyId;
    }
    public String getBodyFirstName() {
        return bodyFirstName;
    }
    public void setBodyFirstName(String bodyFirstName) {
        this.bodyFirstName = bodyFirstName;
    }
    public String getBodyLastName() {
        return bodyLastName;
    }
    public void setBodyLastName(String bodyLastName) {
        this.bodyLastName = bodyLastName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    

}
