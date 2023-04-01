package com.example.demospringboot7PM.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmStrom_number {
    @RequestMapping("/Arm/{number}")
    public String checkNumber(@PathVariable int number){
        int r;
        int orginamNumber;
        int result=0;
        orginamNumber=number;
        while (orginamNumber != 0){
            r = orginamNumber%10;
            result +=Math.pow(r,3);
            orginamNumber/=10;
        }
        if(result==number){
            return "this is Armstrong number"+number;
        }else {
            return "this is not armstrong number"+number;
        }


    }
}
