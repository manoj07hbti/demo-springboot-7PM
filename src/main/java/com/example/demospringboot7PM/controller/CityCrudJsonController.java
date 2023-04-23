package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.student.Model.Cities;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityCrudJsonController {
    ArrayList<Cities> cities = new ArrayList<>();

    @PostMapping("/add_cities_request")
    public String addCitiesRequestBody(@RequestBody Cities city) {
        cities.add(city);
        return "City Added Successfully";
    }
    @GetMapping("/get_cities_request")
    public ArrayList<Cities> getCities() {

        return cities;
    }

}
