package com.bibhav.ausnepitsolutionassignment.service;

import com.bibhav.ausnepitsolutionassignment.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ImplVehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle editVehicle(int id, Vehicle vehicle);
    void deleteVehicle(int id);
    Vehicle activateVehicle(int id);
    Vehicle deactivateVehicle(int id);
    List<Vehicle> getAllVehicles();
    List<Vehicle> getActiveVehicles();
    Optional<Vehicle> getVehicleById(int id);
}
