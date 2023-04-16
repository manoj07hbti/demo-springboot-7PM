package com.example.demospringboot7PM.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringBoot1 {
    // Write a Endpoint, to print even and odd numbers between 234 and  345 and also print only those number which is divisible by 3

    @RequestMapping("/evenOddDivisible3/{start}/{end}")
    public String evenOddDivisible3(@PathVariable int start, @PathVariable int end){
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
            if(i%3==0){
                divisible= divisible + ", " + i;
            }
        }
        return "Even numbers are : " + even + " \n Odd numbers are : " +odd + "\n Numbers divisible by 3 are : " + divisible;
    }

    // Write a Endpoint, to check whether given number is prime number or not
    @RequestMapping("/Isprime/{num}")
    public String Isprime(@PathVariable int num){
        boolean flag = false;
        String result = "Number is prime! ";
        for (int i= 2; i<num; i++){
            if (num%i==0){
                flag = true;
                result = "Number is not prime! ";
                break;
            }
        }
        return result;
    }

    // Write a Endpoint, to print even and odd numbers between 234 and  345 and also print only those number which is divisible by 5

    @RequestMapping("/evenOddDivisible5/{start}/{end}")
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
        return "Even numbers are : " + even + " \n Odd numbers are : " +odd + "\n Numbers divisible by 5 are : " + divisible;
    }


}
