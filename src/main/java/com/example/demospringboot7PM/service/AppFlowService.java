package com.example.demospringboot7PM.service;


import com.example.demospringboot7PM.repository.AppFLowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFLowRepository repository;
    public String hello(){

        return repository.hello();

    }
}
