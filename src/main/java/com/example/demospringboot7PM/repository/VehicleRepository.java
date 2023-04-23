package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    public List<Vehicle> findByBrandNameAndMilage(String name,int milage);

    @Query(value = "select * from VEHICLE where brand_name=:brandName order by price",nativeQuery = true)
    public List<Vehicle> findByBrandNameOrderByAsc(@Param("brandName") String brandName);

    //public List<Vehicle> findByBrandNameOrderByPriceAsc(String brandName);
}
