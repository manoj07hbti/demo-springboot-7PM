package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {
    @Autowired
    AppFlowService service;
    @GetMapping("/flow_app")
    public String hello(){

       // java method: AppFlowService service= new AppFlowService();

        return service.hello();
    }
}
