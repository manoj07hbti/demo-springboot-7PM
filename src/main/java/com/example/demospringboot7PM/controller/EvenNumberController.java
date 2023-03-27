package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenNumberController {
@RequestMapping("/even_number/{number}")

       public String even(@PathVariable int number){

           int i;

           String res=" ";

           for(i= 1; i<=number;i++){

               if(i%2==0){

                   res = res+ " "+i;
               }
           }
            return res;


       }

}
