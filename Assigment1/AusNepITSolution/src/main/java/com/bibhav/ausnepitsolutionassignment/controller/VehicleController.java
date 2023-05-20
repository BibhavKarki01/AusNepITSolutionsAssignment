package com.bibhav.ausnepitsolutionassignment.controller;

import com.bibhav.ausnepitsolutionassignment.model.Vehicle;
import com.bibhav.ausnepitsolutionassignment.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }
    @GetMapping("/getVehicle")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
    @GetMapping("/active")
    public List<Vehicle> getActiveVehicles() {
        return vehicleService.getActiveVehicles();
    }

    @PutMapping("/{id}")
    public Vehicle editVehicle(@PathVariable int id, @RequestBody Vehicle vehicle) {
        return vehicleService.editVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
    }

    @PutMapping("/{id}/activate")
    public Vehicle activateVehicle(@PathVariable int id) {
        return vehicleService.activateVehicle(id);
    }

    @PutMapping("/{id}/deactivate")
    public Vehicle deactivateVehicle(@PathVariable int id) {
        return vehicleService.deactivateVehicle(id);
    }
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable int id) {
        return vehicleService.getVehicleById(id)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found with id: " + id));
    }
}

