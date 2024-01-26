package com.springbootpostgres.spingboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootpostgres.spingboot.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

    City findByCityName(String cityName);
    
}
