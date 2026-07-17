package com.puneet.transpera.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puneet.transpera.demo.entity.User;
import com.puneet.transpera.demo.entity.Vehicle;
import com.puneet.transpera.demo.repository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public String saveVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicleRepository.save(vehicle);
            return "Vehicle added successfully!";
        }
        return "Vehicle cannot be null!";
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public List<Vehicle> getVehiclesByUserId(User userId) {
        return vehicleRepository.findByUser(userId);
    }

    public Vehicle getVehicleById(Long id) {
        if (id == null) {
            return null;
        }
        return vehicleRepository.findById(id).orElse(null);
    }

    public void deleteVehicle(Long id) {
        if (id != null) {
            vehicleRepository.deleteById(id);
        }
    }

    public void updateVehicle(Vehicle vehicle) {

        if (vehicle == null || vehicle.getId() == null) {
            return;
        }

        Long vehicleId = vehicle.getId();
        if (vehicleId == null) {
            return;
        }
        Vehicle oldVehicle
                = vehicleRepository.findById(vehicleId)
                        .orElse(null);

        if (oldVehicle != null) {

            oldVehicle.setVehicleName(
                    vehicle.getVehicleName()
            );

            oldVehicle.setVehicleType(
                    vehicle.getVehicleType()
            );

            oldVehicle.setVehicleNumber(
                    vehicle.getVehicleNumber()
            );

            oldVehicle.setVehicleBrand(
                    vehicle.getVehicleBrand()
            );

            oldVehicle.setVehicleModel(
                    vehicle.getVehicleModel()
            );

            oldVehicle.setFuelType(
                    vehicle.getFuelType()
            );

            oldVehicle.setDrivenKM(
                    vehicle.getDrivenKM()
            );

            oldVehicle.setStatus(
                    vehicle.getStatus()
            );

            vehicleRepository.save(oldVehicle);

        }

    }
}
