package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {


    public String hello(){

        return "hello from repository";
    }



}
