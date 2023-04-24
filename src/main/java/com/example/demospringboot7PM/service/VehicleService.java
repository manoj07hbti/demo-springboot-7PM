package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Vehicle;
import com.example.demospringboot7PM.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public String addData(Vehicle vehicle){

        vehicleRepository.save(vehicle);

        return "Data added successfully";

    }

    public List<Vehicle> getVehicle(){
        return vehicleRepository.findAll();
    }

    public List<Vehicle> getWithBrandAndMilage(String brandName,int milage){

        return vehicleRepository.findByBrandNameAndMilage(brandName,milage);
    }

    public List<Vehicle> getByVehicleTypeAndBrandName(String vehicleType,String brandName){

        return vehicleRepository.findByVehicleTypeAndBrandNameOrderByPriceAsc(vehicleType,brandName);
    }


    public String updatePrice(int allotmentId,double price){

        Vehicle vehicle= vehicleRepository.getById(allotmentId);

        vehicle.setPrice(price);
        vehicleRepository.save(vehicle);

        return "Price updated successfully: "+price;
    }

//    public String updateUsingColumn(double value,int id){
//
//
//        Vehicle vehicle= vehicleRepository.getById(id);
//        vehicle.setPrice(value);
//
//        vehicleRepository.save(vehicle);
//
//        return "Price updated successfully: "+value;
//    }

    public String delete(int id){

        vehicleRepository.deleteById(id);

        return "Vehicle deleted successfully";
    }

    public List<Vehicle> getByNameAndInASC(String brandName){

        return vehicleRepository.findByBrandNameOrderByAsc(brandName);
    }

}
