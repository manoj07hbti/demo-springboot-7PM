package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class T2EligibleForVoting {
    @RequestMapping("/verify_age/{age}")
    public String verifyAge(@PathVariable int age) {
        if (age > 17) {

            return "Person is eligible for voting";

        } else {

            return "Person is not eligible for voting";
        }
    }
}
