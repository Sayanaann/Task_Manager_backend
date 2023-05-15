package com.example.Task_manager.repository;

import com.example.Task_manager.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {
}
