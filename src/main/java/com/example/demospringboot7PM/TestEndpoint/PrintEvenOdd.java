package com.example.demospringboot7PM.TestEndpoint;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintEvenOdd {

    @RequestMapping("/print eod/{start}/{end}")
    public String evenOddDivisible5(@PathVariable int start,@PathVariable int end){
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

        }
        return "Even numbers are : " + even + " \n Odd numbers are : " +odd;
    }

}


















