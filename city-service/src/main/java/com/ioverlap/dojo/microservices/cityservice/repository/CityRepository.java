package com.ioverlap.dojo.microservices.cityservice.repository;

import com.ioverlap.dojo.microservices.cityservice.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select c from City c where c.country=:country")
    List<City> findByCountry(String country);
}
