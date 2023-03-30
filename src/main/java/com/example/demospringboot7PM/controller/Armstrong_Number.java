package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class Armstrong_Number {
@RequestMapping("/arms")
    public String arms(){

        int a, sum =0 ,number, temp;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");

        number=sc.nextInt();

        temp=number;
        while(number==0){

            a = number % 10;

            sum = sum+ ( a * a *a);

            number /=10;

        }
        if(temp==number){

            return temp +" is a Armstrong number";
        }
        else{
            return  temp + "is a not Armstrong number";
        }







        }







    }








