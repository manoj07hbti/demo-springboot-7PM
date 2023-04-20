package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowService service;

    @GetMapping("/app_flow")
    public String hello() {

       // AppFlowService service = new AppFlowService();

        return service.Hello();
    }

    }
