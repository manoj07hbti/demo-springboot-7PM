package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorWithChoiceController {

    @GetMapping("/calculator")
    public String startCalculator(){
        return "Enter 1 for Addition, 2 for Sub, 3 for Mul, 4 for Division";
    }
    @GetMapping("/calculator/{choice}")
    public String choice(@PathVariable int choice){
        return "Enter two Values : Value1/Value2";
    }

    @GetMapping("/calculator/{choice}/{a}/{b}")
    public String calculator(@PathVariable int choice,@PathVariable int a,@PathVariable int b){
        String res="";

        try {
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
        }
        catch (ArithmeticException e){
            return "Divide by Zero Exception"+e;
        }
        return "";
    }

}
