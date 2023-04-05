package com.example.demospringboot7PM.bodyannotation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController

public class City_Body {
    ArrayList<String> City=new ArrayList<>();
    @PostMapping("/city_add/{name}")
public String Add(@PathVariable String name){
    City.add(name);
    return "successfully added "+name;
}
@GetMapping("/city_get")
public ArrayList<String> getCity(){
        return City;
}
@PutMapping("/city_update/{index}/{name}")
public String updatecity(@PathVariable int index,@PathVariable String name){
        City.add(index,name);
        return "successfully update "+index +name;
}
@DeleteMapping("/city_remove/{index}")
public String delete(@PathVariable int index){
        City.remove(index);
        return "successfully remove "+index;
}

}
