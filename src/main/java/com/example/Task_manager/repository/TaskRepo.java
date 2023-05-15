package com.example.Task_manager.repository;

import com.example.Task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {

}
