package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Door;
import com.example.springapp.repository.DoorRepo;
import java.util.*;
@Service
public class DoorService {
    @Autowired
    private DoorRepo doorRepo;
    public boolean saveDoor(Door door)
    {
        try{
            doorRepo.save(door);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Door> getAll()
    {
        return doorRepo.findAll();
    } 
    public List<Door> searchDoorId(int doorId)
    {
        return doorRepo.findByDoorId(doorId);
    } 
    public List<Door> searchDoorAccesType(String accessType)
    {
        
        return doorRepo.findByAccessType(accessType);
    } 
}
