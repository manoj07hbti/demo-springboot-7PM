package com.example.demospringboot7PM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityCRUDController {

    ArrayList<String> citylist= new ArrayList<>();
    @RequestMapping(value = "/add_city",method = RequestMethod.POST)
    public String addCity(@RequestParam String city){

        citylist.add(city);

        return "City added successfully";
    }

    @RequestMapping(value = "/get_city",method = RequestMethod.GET)
    public ArrayList getData(){
        return citylist;
    }
    @RequestMapping(value = "/city_update",method = RequestMethod.PUT)
    public String update(@RequestParam int index, @RequestParam String city){

        citylist.set(index, city);

        return "City updated successfully";
    }

    @RequestMapping(value = "/remove_city",method = RequestMethod.DELETE)
    public ArrayList<String> remove(@RequestParam int index){

        citylist.remove(index);

        return citylist;
    }


}
