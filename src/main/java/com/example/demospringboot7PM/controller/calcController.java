package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class calcController {

    int flag =0;
    int a,b;
    @RequestMapping("/Calculator")

    public String Calculator() {

        String res = "";

        System.out.println("Please enter value of a");

        Scanner scannerObj = new Scanner(System.in);

        int a = scannerObj.nextInt();

        System.out.println("Please enter value of b");

        int b = scannerObj.nextInt();

        System.out.println("Enter for 1 Addition , 2 for sub, 3 for multi , 4 for divide");

        int choice = scannerObj.nextInt();

        if (choice == 1) {
            int c = a + b;
            res = "Addition is :" + c;
            return res;
        }
        if (choice == 2) {
            int c = a - b;
            res = "sub is :" + c;
            return res;
        }
        if (choice == 3) {
            int c = a * b;
            res = "multi is :" + c;
            return res;
        }
        if (choice == 4) {
            double c = a / b;
            res = "divide is :" + c;
            return res;


        }
          return "Please enter number 1 and 4";
    }
}























