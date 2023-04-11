package com.example.demospringboot7PM.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
@Repository
public class AppFlowRepository {

    public String hello(){

        return "Hello from Repository... ";
    }
}
