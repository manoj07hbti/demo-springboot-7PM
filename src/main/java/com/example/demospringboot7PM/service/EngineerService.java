package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Engineer;
import com.example.demospringboot7PM.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository engRepo;

    public String addEng(Engineer eng){

        engRepo.save(eng);

        return "Engineer added successfully";
    }

    public List<Engineer> getAllEng(){

        return engRepo.findAll();
    }
}
