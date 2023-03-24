package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {

    @RequestMapping("/prime_number")
    public String prime(){

        int num=29,i=2;
        boolean flag=true;
        String res="";

        while (i<num/2){
            if (num%i==0){
                flag=false;
                break;
            }
            else{
                flag=true;
            }
            if (flag=true){
                res="Number is Prime Number";
            }
            else {
                res="Number is not a Prime Number";
            }
            i++;
        }

        return res;
    }

}
