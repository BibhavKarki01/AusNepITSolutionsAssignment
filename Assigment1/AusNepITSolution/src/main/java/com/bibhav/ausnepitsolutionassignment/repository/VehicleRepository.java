package com.bibhav.ausnepitsolutionassignment.repository;

import com.bibhav.ausnepitsolutionassignment.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository  extends JpaRepository <Vehicle, Integer>{


    List<Vehicle> findByActiveTrue ();
}
