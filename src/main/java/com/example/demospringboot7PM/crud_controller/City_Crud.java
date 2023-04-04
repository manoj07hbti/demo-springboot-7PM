package com.example.demospringboot7PM.crud_controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class City_Crud {
    // Operation CRUD
    // C= create or add, R= read and get, U= upload resource, D= Delete resource

    ArrayList<String> City=new ArrayList<>();
    @RequestMapping("/Add_City/{name}")
    public String Add(@PathVariable String name){
        City.add(name);
        return "City added successfully " +name;
    }
    @RequestMapping("/get_City")
    public ArrayList<String> getCity(){
        return City;
    }
    @RequestMapping("/update_city/{name}/{index}")
    public String updatecity(int index, String name){
        City.add(index, name );
        return "City update successfully "+ name;
    }
    @RequestMapping("/remove_city/{index}")
    public String deleteCity(int index){
        City.remove(index);
        return "City successfully remove";
    }


}
