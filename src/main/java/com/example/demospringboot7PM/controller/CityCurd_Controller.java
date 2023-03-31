package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
   @RestController
      public class CityCurd_Controller{

    ArrayList<String> state = new ArrayList<>();

    // CRUD

    //  C Create or add
     @RequestMapping("/add_state/{city}")

     public String add(@PathVariable String city){

        state.add(city);

         return "state is add to successfully :"+city;


     }










}
