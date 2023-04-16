package com.example.demospringboot7PM.tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccurrenceController {

    int arr[]={1,2,3,1,4,5,2,3,2,5,5,2,7,8};

    @GetMapping("/occurrence/{value}")
    public String occurrence(@PathVariable int value){
        int occurrence=0;
        for (int i=0;i<arr.length;i++){
            if (value==arr[i]){
                occurrence++;
            }
        }

        return value+" occurred "+occurrence+" times";
    }

}
