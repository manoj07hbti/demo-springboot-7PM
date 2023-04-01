package com.example.demospringboot7PM.requastparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Palindrom_Param {
    @RequestMapping("/palindrom_param")
    public String palind(@RequestParam int number){

        int r;
        int sum=0;
        int temp=number;
        while (number > 0) {
            r= number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum){
            return "this is palindrom number "+number;
        }
        else {
            return "this is not palindrom number "+number;
        }
    }
}
