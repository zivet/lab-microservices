package com.ioverlap.dojo.microservices.cityservice.services;

import com.ioverlap.dojo.microservices.cityservice.entity.City;

import java.util.List;

public interface CityService {

     List<City> findByCountry(String country);

     List<City> findAll();
}
