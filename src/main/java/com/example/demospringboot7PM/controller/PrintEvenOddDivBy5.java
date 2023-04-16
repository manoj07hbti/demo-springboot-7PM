package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class PrintEvenOddDivBy5 {

    @RequestMapping("/print_eod5/{start}/{end}")
    public String evenOddDivisible5(@PathVariable int start, @PathVariable int end){
        String even = "";
        String odd = "";
        String divisible = "";
        for(int i=start; i<=end; i++){
            if(i%2==0){
                even = even + ", " + i;
            }
            else {
                odd = odd + ", " + i;
            }
            if(i%5==0){
                divisible= divisible + ", " + i;
            }
        }
        return "Even numbers are : " + even + " \n Odd numbers are : " +odd + " \n Numbers divisible by 5 are : " + divisible;
    }

}
