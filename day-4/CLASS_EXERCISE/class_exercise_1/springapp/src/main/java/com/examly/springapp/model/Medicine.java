package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    private int medicineId;
    private String medicieName;
    private String medicieneFor;
    private String medicineBrand;
    private String manufacturedIn;
    private double mediciePrice;
    private String expiryDate;
    public Medicine() {
    }
    public Medicine(int medicineId, String medicieName, String medicieneFor, String medicineBrand,
            String manufacturedIn, double mediciePrice, String expiryDate) {
        this.medicineId = medicineId;
        this.medicieName = medicieName;
        this.medicieneFor = medicieneFor;
        this.medicineBrand = medicineBrand;
        this.manufacturedIn = manufacturedIn;
        this.mediciePrice = mediciePrice;
        this.expiryDate = expiryDate;
    }
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicieName() {
        return medicieName;
    }
    public void setMedicieName(String medicieName) {
        this.medicieName = medicieName;
    }
    public String getMedicieneFor() {
        return medicieneFor;
    }
    public void setMedicieneFor(String medicieneFor) {
        this.medicieneFor = medicieneFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public double getMediciePrice() {
        return mediciePrice;
    }
    public void setMediciePrice(double mediciePrice) {
        this.mediciePrice = mediciePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
}
