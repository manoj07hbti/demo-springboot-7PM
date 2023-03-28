package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class DemoCalculatorController {

    int flag=0;
    int a,b;
    @RequestMapping("/calculator")
    public String calculator(){


            String res = "";
            System.out.println("Please Enter value of a : ");
            Scanner obj = new Scanner(System.in);
            int a = obj.nextInt();

            System.out.println("Please Enter value of a : ");
            int b = obj.nextInt();

            System.out.println("Enter 1 for Addition, 2 for Sub, 3 for Mul, 4 for Division");
            int choice = obj.nextInt();

            if (choice == 1) {
                int c = a + b;
                res = "Addition is : " + c;
                return res;
            }
            if (choice == 2) {
                int c = a - b;
                return "Subtraction is : " + c;
            }
            if (choice == 3) {
                int c = a * b;
                return "Multiply is : " + c;
            }
            if (choice == 4) {
                double c = (double) a / b;
                return "Division is : " + c;
            }
        return "Please Enter number between 1 to 4";
    }

}
