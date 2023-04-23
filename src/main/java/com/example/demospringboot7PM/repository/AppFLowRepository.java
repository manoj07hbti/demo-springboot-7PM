package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.service.AppFlowService;
import org.springframework.stereotype.Repository;

@Repository
public class AppFLowRepository{

    public String hello(){

        return "hello from Repository......";

    }
}
