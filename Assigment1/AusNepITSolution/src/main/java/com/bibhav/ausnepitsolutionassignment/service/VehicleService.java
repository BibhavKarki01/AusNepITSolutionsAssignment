package com.bibhav.ausnepitsolutionassignment.service;

import com.bibhav.ausnepitsolutionassignment.model.Vehicle;
import com.bibhav.ausnepitsolutionassignment.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements ImplVehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle editVehicle(int id, Vehicle vehicle) {
        Vehicle existingVehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found with id: " + id));

        existingVehicle.setManufacturer(vehicle.getManufacturer());
        existingVehicle.setPrice(vehicle.getPrice());
        existingVehicle.setModel(vehicle.getModel());
        existingVehicle.setYear(vehicle.getYear());
        existingVehicle.setActive(vehicle.isActive());

        return vehicleRepository.save(existingVehicle);
    }

    @Override
    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public Vehicle activateVehicle(int id) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found with id: " + id));

        vehicle.setActive(true);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle deactivateVehicle(int id) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found with id: " + id));

        vehicle.setActive(false);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getActiveVehicles() {
        return vehicleRepository.findByActiveTrue();
    }

    @Override
    public Optional<Vehicle> getVehicleById(int id) {
        return vehicleRepository.findById(id);
    }
}

