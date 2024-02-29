package com.examly.springapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Medicine;
import com.examly.springapp.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepo;

    public boolean savaMedicine(Medicine medicine)
    {
        try{
                medicineRepo.save(medicine);
                return true;
            }
            catch(Exception e)
            {
                return false;
            }
    }
    public List<Medicine> getMedicines()
    {

        return medicineRepo.findAll();
    }
    public Medicine getByMedicineId(int medicineId)
    {
        return medicineRepo.findById(medicineId).orElse(null);
       
    }
        
}
