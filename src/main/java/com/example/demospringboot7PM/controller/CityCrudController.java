package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityCrudController {

    ArrayList<String> city = new ArrayList<>();
    @RequestMapping("/createCity/{name}")
    public String createCity(@PathVariable String name){
        city.add(name);
        return "city list is created successfully.... with name : " +name;
    }

    @RequestMapping("/getCity")
    public ArrayList<String> getCity(){
        return city;
    }

    @RequestMapping("/updateCity/{index}/{name}")
    public String updateCity( @PathVariable int index, @PathVariable String name){
        city.set(index, name);

        return "city name : " +name + " at index " +index + " is updated! ";
    }

    @RequestMapping("/deletecity/{index}")
    public String deleteCity ( @PathVariable int index){
        city.remove(index);
        return "city delete successfully";
    }
}
