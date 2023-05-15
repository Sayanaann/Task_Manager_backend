package com.example.Task_manager.service;


import com.example.Task_manager.dto.TaskAssignmentDto;
import com.example.Task_manager.entity.TaskAssignment;

import java.util.List;

public interface PatientService {
    public List<TaskAssignmentDto> getPatient(int id);
    public void deleteTask(List<Integer> id);
}
