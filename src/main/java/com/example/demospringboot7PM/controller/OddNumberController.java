package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddNumberController {


//    Scanner sc= new Scanner(System.in);
//    int number=sc.nextInt();
    @RequestMapping("/odd_number")
    public String odd(@RequestParam int number){

        String output="";
        for (int i=0;i<=number;i++){
            if (i%2!=0){
                output=output+" , "+i;
            }
        }
        return "Odd Numbers : "+output;
    }
}
