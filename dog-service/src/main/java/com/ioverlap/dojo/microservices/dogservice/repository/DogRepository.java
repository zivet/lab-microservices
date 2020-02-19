package com.ioverlap.dojo.microservices.dogservice.repository;

import com.ioverlap.dojo.microservices.dogservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
