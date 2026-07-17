package com.puneet.transpera.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.puneet.transpera.demo.entity.Vehicle;
import com.puneet.transpera.demo.entity.User;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
List<Vehicle> findByUser(User user); 
}