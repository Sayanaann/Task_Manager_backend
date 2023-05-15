package com.example.Task_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")

public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private int mrn;
    private String gender;
    private int age;
    private String dob;

    public Patient() {
    }

    public Patient(int id, String firstname, String lastname, int mrn, String gender, int age, String dob) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mrn = mrn;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMrn() {
        return mrn;
    }

    public void setMrn(int mrn) {
        this.mrn = mrn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}