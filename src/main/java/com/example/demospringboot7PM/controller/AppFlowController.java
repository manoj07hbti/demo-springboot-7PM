package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowService service;

    @GetMapping("/get_flow")
    public String m1(){

        return service.m1();
    }

}
