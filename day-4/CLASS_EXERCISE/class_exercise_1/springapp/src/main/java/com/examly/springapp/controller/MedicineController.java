package com.examly.springapp.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Medicine;
// import com.examly.springapp.service.MedicineService;
import com.examly.springapp.service.MedicineService;

@RestController
public class MedicineController 
{   
    private MedicineService medicineService;
    
   public MedicineController(MedicineService medicineService) 
   {
    this.medicineService=medicineService;
    }
    @PostMapping("/api/medicine")
   public ResponseEntity<Medicine> postMedicine(@RequestBody Medicine medicine)
   {
            if(medicineService.savaMedicine(medicine)==true)
            {
                return new ResponseEntity<>(medicine,HttpStatus.CREATED);
            }
            return new ResponseEntity<>(medicine,HttpStatus.INTERNAL_SERVER_ERROR);
            
        }
        @GetMapping("/api/medicines")
        public ResponseEntity<List<Medicine>> getMedicine()
        {
            List<Medicine> b=medicineService.getMedicines();
            if(b.size()>0)
            {
            
                return new ResponseEntity<List<Medicine>>(b,HttpStatus.OK);
            }
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
        }
        @GetMapping("/api/medicine/{medicineId}")
        public ResponseEntity<Medicine> getMedicine(@PathVariable("medicineId")  int medicineId)
        {
            Medicine a=medicineService.getByMedicineId(medicineId);
            if(a!=null)
            {
                
                return new ResponseEntity<>(a,HttpStatus.OK);
            }
            return new ResponseEntity<>(a,HttpStatus.NOT_FOUND);
        }
    }
   
