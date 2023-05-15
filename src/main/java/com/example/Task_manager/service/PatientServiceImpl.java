package com.example.Task_manager.service;

import com.example.Task_manager.dto.TaskAssignmentDto;
import com.example.Task_manager.entity.TaskAssignment;
import com.example.Task_manager.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private TaskAssignmentRepo taskAssignmentRepo;
    @Autowired
    private PatientRepo patientRepo;
    @Autowired
    private LocationRepo locationRepo;
    @Autowired
    private OwnerRepo ownerRepo;
    @Autowired
    private TaskRepo taskRepo;

    public List<TaskAssignmentDto> getPatient(int id){
        List<TaskAssignment> taskAssignmentList = taskAssignmentRepo.findByPatientId(id);
        List<TaskAssignmentDto> taskAssignmentDtos=new ArrayList<>();
        for(TaskAssignment taskAssignment:taskAssignmentList){
            TaskAssignmentDto taskAssignmentDto=new TaskAssignmentDto();
            taskAssignmentDto.setId(taskAssignment.getId());
            taskAssignmentDto.setDue_today(taskAssignment.getDue_today());
            taskAssignmentDto.setIsdeleted(taskAssignment.getIsdeleted());
            taskAssignmentDto.setCreatedAt(taskAssignment.getCreatedAt());
            taskAssignmentDto.setUpdatedAt(taskAssignment.getUpdatedAt());
            taskAssignmentDto.setStatus(taskAssignment.getStatus());
            taskAssignmentDto.setPriority(taskAssignment.getPriority());
            taskAssignmentDto.setComment(taskAssignment.getComment());
            taskAssignmentDto.setPatientDto(taskAssignment.getPatient());
            taskAssignmentDto.setLocationDto(taskAssignment.getLocation());
            taskAssignmentDto.setOwnerDto(taskAssignment.getOwner());
            taskAssignmentDto.setTaskDto(taskAssignment.getTask());
            taskAssignmentDtos.add(taskAssignmentDto);
        }
        System.out.println(taskAssignmentList);
        return taskAssignmentDtos;
    }

    @Override
    public void deleteTask(List<Integer> id) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        taskAssignmentRepo.deleteById(id,currentDateTime);
    }


}
