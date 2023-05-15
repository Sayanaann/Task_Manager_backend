package com.example.Task_manager.repository;

import com.example.Task_manager.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {


}
