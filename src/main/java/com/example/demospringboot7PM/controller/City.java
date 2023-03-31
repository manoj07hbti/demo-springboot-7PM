package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class City {
    ArrayList<String>cities=new ArrayList<>();
    @RequestMapping("/city/{name}")
    public String city(@PathVariable String name){

        cities.add(name);
        return "metro city is "+name;
    }

    @RequestMapping("/get_city")
    public ArrayList<String> getCities() {
        return cities;
    }
    @RequestMapping("/update_city/{index}/{name}")
    public String update(@PathVariable int index,@PathVariable String name){

        cities.set(index,name);
        return "updated city is "+name;
    }
    @RequestMapping("/delete/{index}")
    public String delete(@PathVariable int index){
        cities.remove(index);
        return "city is deleted";
    }
}
