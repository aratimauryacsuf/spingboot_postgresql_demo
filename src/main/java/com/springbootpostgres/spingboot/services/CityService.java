package com.springbootpostgres.spingboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.springbootpostgres.spingboot.entities.City;
import com.springbootpostgres.spingboot.repositories.CityRepository;

import io.micrometer.common.lang.NonNull;

@Service
public class CityService {
    
    @Autowired 
    CityRepository cityRepository;

    public CityService(){

    }

    public List<City> getCities(){
        return cityRepository.findAll();
    }

  
    public City saveCity( City city) {
        // TODO Auto-generated method stub

       return  cityRepository.save(city);
      
    }

    public City getCity(String cityName) {
        return cityRepository.findByCityName(cityName);
    }
}
