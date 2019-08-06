package com.rakuten.summerinternship.database.service;

import com.rakuten.summerinternship.database.domain.Task;
import com.rakuten.summerinternship.database.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskService {

    private TaskRepository repository;
    
    @Autowired
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Page<Task> getAllTasks(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Transactional
    public void save(Task task) {
        repository.save(task);
    }
}
