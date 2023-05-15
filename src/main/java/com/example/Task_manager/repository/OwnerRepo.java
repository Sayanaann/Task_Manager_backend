package com.example.Task_manager.repository;

import com.example.Task_manager.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepo extends JpaRepository<Owner,Integer> {
}
