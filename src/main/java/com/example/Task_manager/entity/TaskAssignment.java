package com.example.Task_manager.entity;

import jakarta.persistence.*;

@Entity
@Table(name="task_assignment")

public class TaskAssignment {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;
    private String priority;
    private String due_today;
    private String status;

    private int isdeleted;
    private String createdAt;
    private String updatedAt;

    private String comment;

    public TaskAssignment() {
    }

    public TaskAssignment(int id, Patient patient, Location location, Owner owner, Task task, String priority, String due_today, String status, int isdeleted, String createdAt, String updatedAt, String comment) {
        this.id = id;
        this.patient = patient;
        this.location = location;
        this.owner = owner;
        this.task = task;
        this.priority = priority;
        this.due_today = due_today;
        this.status = status;
        this.isdeleted = isdeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
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
