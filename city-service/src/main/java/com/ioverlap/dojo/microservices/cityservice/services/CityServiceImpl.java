package com.ioverlap.dojo.microservices.cityservice.services;

import com.ioverlap.dojo.microservices.cityservice.repository.CityRepository;
import com.ioverlap.dojo.microservices.cityservice.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    public List<City> findByCountry(String country) {
        return cityRepository.findByCountry(country);
    }

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }
}
