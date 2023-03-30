package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armsparam {
    @RequestMapping("/armstrong_request_param")
    public String armstrong(@RequestParam int x){
        int a, arm = 0, n, temp;
        n = x;
        temp = n;
        while (n != 0) {
            a = n % 10;
            arm = arm + (a * a * a);
            n /= 10;
        }
        if (arm == temp)
            return (temp + " is a armstrong number ");
        else
            return (temp + " is not a armstrong number ");
    }
}

