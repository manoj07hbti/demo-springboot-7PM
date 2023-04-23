package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityCrudController {

    ArrayList<String> cities = new ArrayList<>();

    //Adding list of cities
    @PostMapping("/add_city/{name}")
    public String add(@PathVariable String name) {
        cities.add(name);
        return name+" :-> City name added successfully";
    }

    //Method to get all the city name which are added to the list
    @GetMapping("/get_cities")
    public String getCities() {
        return "List of cities are: " + cities;
    }

    // Update city name in the list
    @PutMapping("/update_cities/{index}/{name}")
    public String updateCities(@PathVariable int index, @PathVariable String name) {
        cities.set(index, name);
        return ("City updated as: " + name);
    }

    //Delete city from the list
    @DeleteMapping("/delete_cities/{name}")
    public String deleteCities(@PathVariable String name) {
        cities.remove(name);
        return (name + " :-> Deleted sucessfully");
    }

}

