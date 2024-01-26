package com.springbootpostgres.spingboot.controllers;


import org.springframework.web.bind.annotation.RestController;

import com.springbootpostgres.spingboot.entities.City;
import com.springbootpostgres.spingboot.services.CityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class HomeController {

    @Autowired
    CityService cityService;

   @GetMapping( value = "/hello")
    public String sayHello(){
        return "Hello User";
    }

    @GetMapping("getcities")
    public List<City> getCities() {
        return cityService.getCities();
    }
    
    @PostMapping("addcity")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }
    
    @GetMapping("getcity")
    public City getCity(String cityName) {
        return cityService.getCity(cityName);
    }
    
}
