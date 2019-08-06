package com.rakuten.summerinternship.database.service;

import com.rakuten.summerinternship.database.repository.TaskRepository;

import java.util.List;

import com.rakuten.summerinternship.database.domain.Task;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskService {

    // private TaskRepository repository;
    
    // public List<Task> getAllTasks() {
    //     return repository.findAll();
    // }

    // @Transactional
    // public void save(Task task) {
    //     repository.save(task);
    // }
}
