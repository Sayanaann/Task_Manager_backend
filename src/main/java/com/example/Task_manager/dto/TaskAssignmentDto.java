package com.example.Task_manager.dto;

import com.example.Task_manager.entity.Location;
import com.example.Task_manager.entity.Owner;
import com.example.Task_manager.entity.Patient;
import com.example.Task_manager.entity.Task;

public class TaskAssignmentDto {
    private int id;
    private PatientDto patient;
    private LocationDto location;
    private OwnerDto owner;
    private TaskDto task;
    private String priority;
    private String due_today;
    private String status;
    private int isdeleted;
    private String createdAt;
    private String updatedAt;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PatientDto getPatientDto() {
        return patient;
    }

    public void setPatientDto(Patient patient) {
        PatientDto patientDto=new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setFirstname(patient.getFirstname());
        patientDto.setLastname(patient.getLastname());
        patientDto.setAge(patient.getAge());
        patientDto.setDob(patient.getDob());
        patientDto.setMrn(patient.getMrn());
        patientDto.setGender(patient.getGender());
        this.patient = patientDto;
    }

    public LocationDto getLocationDto() {

        return location;
    }

    public void setLocationDto(Location location) {
        LocationDto locationDto=new LocationDto();
        locationDto.setId(location.getId());
        locationDto.setBed(location.getBed());
        locationDto.setFacility(location.getFacility());
        locationDto.setUnit(location.getUnit());
        this.location = locationDto;
    }

    public OwnerDto getOwnerDto() {
        return owner;
    }

    public void setOwnerDto(Owner owner) {
        OwnerDto ownerDto=new OwnerDto();
        ownerDto.setId(owner.getId());
        ownerDto.setName(owner.getName());
        this.owner = ownerDto;
    }

    public TaskDto getTaskDto() {
        return task;
    }

    public void setTaskDto(Task task) {
        TaskDto taskDto=new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTask_description(task.getTask_description());
        this.task = taskDto;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDue_today() {
        return due_today;
    }

    public void setDue_today(String due_today) {
        this.due_today = due_today;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(int isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
