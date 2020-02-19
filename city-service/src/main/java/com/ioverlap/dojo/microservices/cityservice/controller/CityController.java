package com.ioverlap.dojo.microservices.cityservice.controller;

import com.ioverlap.dojo.microservices.cityservice.entity.City;
import com.ioverlap.dojo.microservices.cityservice.entity.Dog;
import com.ioverlap.dojo.microservices.cityservice.services.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/cities/{dogId}")
    public List<City> nativeCity(@PathVariable("dogId") Long dogId) {
        Dog dog = restTemplate.getForObject("http://dog-service/dogs/" + dogId, Dog.class);
        return cityService.findByCountry(dog.getOrigin());
    }

}
