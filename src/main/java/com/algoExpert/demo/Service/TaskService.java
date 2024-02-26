package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.Task;
import com.algoExpert.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {
     @Autowired
    private TaskRepository taskRepository;
    public Task addTask(Task task){
     return taskRepository.save(task); }


    public List<Task> getAllTask(){
        return (List<Task>) taskRepository.findAll();
    }
}

