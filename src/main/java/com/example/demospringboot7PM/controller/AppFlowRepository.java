package com.example.demospringboot7PM.controller;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String hello (){
        return "Hello from Repository........v";
    }

}
