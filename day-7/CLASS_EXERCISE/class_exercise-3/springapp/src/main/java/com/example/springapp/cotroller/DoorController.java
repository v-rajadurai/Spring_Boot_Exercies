package com.example.springapp.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Door;
import com.example.springapp.service.DoorService;

@RestController
public class DoorController {
    @Autowired
    private DoorService doorService;
    @PostMapping("/api/door")
    public ResponseEntity<Door> postDoor(@RequestBody Door door)
    {
        if(doorService.saveDoor(door)==true)
        {
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(door,HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getDoor()
    {
        List<Door> a=doorService.getAll();
        if(a!=null)
        {
            return new ResponseEntity<List<Door>>(a,HttpStatus.OK);
        }
        return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<Door>> getDoorId(@PathVariable int doorId)
    {
        
        List<Door> d=doorService.searchDoorId(doorId);
        if(d!=null)
        {
            return new ResponseEntity<List<Door>>(d,HttpStatus.OK);
        }
        return new ResponseEntity<>(d,HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    @GetMapping("/api/door/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getDooraccessType(@PathVariable String accessType)
    {
        
        List<Door> c=doorService.searchDoorAccesType(accessType);
        if(c!=null)
        {
            return new ResponseEntity<List<Door>>(c,HttpStatus.OK);
        }
        return new ResponseEntity<>(c,HttpStatus.INTERNAL_SERVER_ERROR);
    } 
   
}
