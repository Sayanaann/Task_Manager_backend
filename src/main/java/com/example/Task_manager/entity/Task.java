package com.example.Task_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")

public class Task {

    @Id
    @GeneratedValue
    private int id;
    private String task_description;





    public Task() {
    }

    public Task(int id, String task_description) {
        this.id = id;
        this.task_description = task_description;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }




}