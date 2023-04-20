package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.controller.AppFlowController;
import com.example.demospringboot7PM.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;
    public String Hello() {


        return "hello from repository";
    }
    }
