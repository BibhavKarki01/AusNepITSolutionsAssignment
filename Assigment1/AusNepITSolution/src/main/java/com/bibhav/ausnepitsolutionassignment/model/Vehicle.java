package com.bibhav.ausnepitsolutionassignment.model;

import jakarta.persistence.*;


@Entity
@Table(name="vehicles")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;

    private int price;
    private String model;
    private int year;
    private boolean active;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getManufacturer () {
        return manufacturer;
    }

    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public boolean isActive () {
        return active;
    }

    public void setActive (boolean active) {
        this.active = active;
    }
}
