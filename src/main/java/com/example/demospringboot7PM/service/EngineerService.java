package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modelClass.EngineerTable;
import com.example.demospringboot7PM.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {
    @Autowired
    EngineerRepository repository;
    public String Addengineer(EngineerTable engineer){
        repository.save(engineer);
        return "Engineer data add seccessfully";
    }
    public List<EngineerTable> get() {
        return repository.findAll();
    }

    public String updateEngineerData(long id, String name){
        EngineerTable engineer=repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);
        return "Engineer data update seccessfully";
    }
    public String Delete(long id){
        repository.deleteById(id);
        return "Engineer remove data successfully";
    }

}
