package com.example.Task_manager.controller;

import com.example.Task_manager.dto.ErrorHandlingDto;
import com.example.Task_manager.dto.IdDto;
import com.example.Task_manager.dto.TaskAssignmentDto;
import com.example.Task_manager.entity.TaskAssignment;
import com.example.Task_manager.repository.TaskAssignmentRepo;
import com.example.Task_manager.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
@RestController
public class TaskController {

    @Autowired
    PatientService patientService;
    @Autowired
    private TaskAssignmentRepo taskAssignmentRepo;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/getPatient/{id}")
    public List<TaskAssignmentDto> getPatient(@PathVariable("id") int patientId) {
        return patientService.getPatient(patientId);
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletetask")
    public HashMap<String,String> deletetask(@RequestBody List<Integer> ids) {
        System.out.println(ids);
        patientService.deleteTask(ids);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorHandlingDto> handleException(Exception e){
        ErrorHandlingDto errorHandling = new ErrorHandlingDto();
        errorHandling.setStatus("failed");
        errorHandling.setMessage(e.getMessage());
        return new ResponseEntity<>(errorHandling, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}