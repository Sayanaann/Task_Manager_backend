package com.example.Task_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="location")

public class Location {

    @Id
    @GeneratedValue
    private int id;
    private String facility;
    private String unit;
    private int bed;


    public Location() {
    }

    public Location(int id, String facility, String unit, int bed) {
        this.id = id;
        this.facility = facility;
        this.unit = unit;
        this.bed = bed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }
}