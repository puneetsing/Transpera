package com.puneet.transpera.demo.repository;

import com.puneet.transpera.demo.entity.Vehiclelocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface VehicleLocationRepository
        extends MongoRepository<Vehiclelocation, String> {

    List<Vehiclelocation> findByVehicleId(Long vehicleId);
}
