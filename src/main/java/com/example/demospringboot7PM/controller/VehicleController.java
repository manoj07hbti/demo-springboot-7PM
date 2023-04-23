package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Vehicle;
import com.example.demospringboot7PM.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.SAAJResult;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping("/vehicle")
    public String addData(@RequestBody Vehicle vehicle){

        return vehicleService.addData(vehicle);
    }

    @GetMapping("/get_all")
    public List<Vehicle> getVehicle(){

        return vehicleService.getVehicle();
    }

    @GetMapping("/getWithNameAndMilage/{name}/{milage}")
    public List<Vehicle> getWithNameAndMilage(@PathVariable String name,@PathVariable int milage){

        return vehicleService.getWithBrandAndMilage(name,milage);
    }


    @PutMapping("/updatePrice/{allotmentId}/{price}")
    public String updatePrice(@PathVariable int allotmentId,@PathVariable double price){

        return vehicleService.updatePrice(allotmentId,price);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        return vehicleService.delete(id);

    }
    @GetMapping("/getUsingBrandName")
    public List<Vehicle> getByNameAndInASC(@RequestParam String brandName){

        return vehicleService.getByNameAndInASC(brandName);
    }

}
