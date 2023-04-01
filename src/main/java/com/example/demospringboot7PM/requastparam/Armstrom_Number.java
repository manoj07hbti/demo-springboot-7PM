package com.example.demospringboot7PM.requastparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Armstrom_Number {
    @RequestMapping("/Armstrom_param")
    public String armNumber(@RequestParam int number){
        int r;
        int originalNumber;

        int result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            r =originalNumber%10;
            result +=Math.pow(r,3);
            originalNumber/=10;

        }
        if(result==number){
            return "this is armstrom number"+number;
        }
        else {
            return "this is not armstrom number "+number;
        }
    }
}
