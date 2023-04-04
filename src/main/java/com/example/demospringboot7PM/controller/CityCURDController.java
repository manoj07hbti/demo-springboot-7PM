package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CityCURDController {

    ArrayList<String> cityList = new ArrayList<>();
@PostMapping("/addCity")
    public String add(@RequestBody String  cityName){

     cityList.add(cityName);

     return "City add successfully";

}
@GetMapping("/getCity")
    public ArrayList get(){

      return cityList;
    }
    @PutMapping("/updateCity/{index}/{cityName}")
    public String update(@PathVariable int index,@PathVariable String cityName){

       cityList.set(index, cityName);

       return "City update successfully";
    }
    @DeleteMapping("deleteCity")
    public String Delete(@RequestBody Integer index){

      int Index= index;

      cityList.remove(index);

      return "Delete city successfully";



    }


}
