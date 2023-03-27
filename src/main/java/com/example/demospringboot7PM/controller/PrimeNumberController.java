package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {
    @RequestMapping("/Prime_number")
    public String Prime() {

        int num = 13, i = 2;
        boolean flag = true;
        String result = "";

        while (i < num / 2) {
            if (num % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
            if (flag = true) {

                result = "Number is Prime number";
            } else {

                result = "Number is not Prime number";
            }
            i++;
        }
        return result;
    }
}
