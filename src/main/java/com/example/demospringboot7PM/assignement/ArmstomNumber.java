package com.example.demospringboot7PM.assignement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class ArmstomNumber {
    @RequestMapping("/Armstrom")
    public String CheckNumber() {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

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
