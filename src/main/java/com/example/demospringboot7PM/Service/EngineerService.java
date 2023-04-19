package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Model.Engineer;
import com.example.demospringboot7PM.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository repository;
    public String add(Engineer engineer){

        repository.save(engineer);

        return "Engineer add successfully";
    }
    public List<Engineer> fetchAllEngineer(){

        return repository.findAll();
    }
    public String updateInfo(long id ,String name){

        Engineer engineer= repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);

        return "update data successfully";
    }
    public String removeEngineer(long id){

        repository.deleteById(id);

        return "Delete data successfully";
    }






}
