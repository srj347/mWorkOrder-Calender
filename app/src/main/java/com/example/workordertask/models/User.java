package com.example.workordertask.models;

import java.util.List;

public class User {
    private String name;
    private List<Task> taskList;

    public User(String name, List<Task> taskList) {
        this.name = name;
        this.taskList = taskList;
    }

    public void setList(List<Task> taskList){
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
