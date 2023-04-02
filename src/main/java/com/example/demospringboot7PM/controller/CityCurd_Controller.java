package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     @RequestMapping("/get_State")

     public ArrayList<String> getState(){

         return state;
     }
     @RequestMapping("/update_state/{index}/{city}")
     public String UpdateState(@PathVariable int index ,@PathVariable String city){

         state.set(index,city);

         return "State name as Update :" +city;

     }
     @RequestMapping("/delete_state/")
     public String delete_state( @RequestParam int index){

         state.remove(index);

         return "State delete successfully :";




     }










}
