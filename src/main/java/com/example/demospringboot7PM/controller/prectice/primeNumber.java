package com.example.demospringboot7PM.controller.prectice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeNumber {
@RequestMapping("/prime_number")
    public String Prime(){

        int number =19,i=2;

        boolean flag=true;

        String result = "";

           while(i<number/2){
               if(i%2==0){
                   flag=false;
                   break;
               }else{

                   flag= true;
               }
               if(flag==true){
                   result=" Number isPrime number";
               }
               else{

                   result="Number is not Prime number";
               }
               i++;
        }
           return result;




          }

    }














