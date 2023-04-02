package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewCityCRUDController {

    ArrayList<String> cityList= new ArrayList<>();

    @PostMapping("/addCity")
    public String add(@RequestBody String cityName){

        cityList.add(cityName);

        return "City added successfully";
    }

    @GetMapping("/getCity")
    public ArrayList get(){

        return cityList;
    }

    @PutMapping("/updateCity")
    public String update(@RequestParam int index, String city){

        cityList.set(index,city);

        return "City updated successfully";
    }

    @DeleteMapping("/deleteCity")
    public String delete(@RequestBody Integer index){
        int Index=index;
        cityList.remove(Index);

        return "City deleted successfully";
    }

}
