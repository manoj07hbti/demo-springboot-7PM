package com.example.demospringboot7PM.TestEndpoint;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindPercentValue {
@RequestMapping("/fnd_percent/{num}/{per}")
    public String findpercetage(@PathVariable int num,@PathVariable int per){

         int ans=num*per/100;

         return per+" % of "+num+" is "+ ans;




    }









}
