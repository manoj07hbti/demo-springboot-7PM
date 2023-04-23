package com.example.demospringboot7PM.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class FindPercentValue {
    @RequestMapping("/find_percent_value/{num}/{per}")
    public String findpercentval(@PathVariable int num, @PathVariable int per){
        int ans= num*per/100;
        return per+" % of "+num+" is "+ ans;
    }

}
