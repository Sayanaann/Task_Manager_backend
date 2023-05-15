package com.example.Task_manager.repository;

import com.example.Task_manager.entity.TaskAssignment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskAssignmentRepo extends JpaRepository<TaskAssignment,Integer> {
    List<TaskAssignment> findByPatientId(int id);

    @Modifying
    @Transactional
    @Query(value="UPDATE `task_assignment` SET `isdeleted`=1, `updated_at`=:updateat WHERE `id` IN :id",nativeQuery = true)
     public void deleteById(@Param("id") List<Integer> id, @Param("updateat")LocalDateTime updateat);

}
