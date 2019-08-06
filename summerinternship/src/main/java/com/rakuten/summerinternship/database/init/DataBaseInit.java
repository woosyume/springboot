package com.rakuten.summerinternship.database.init;

import com.rakuten.summerinternship.database.domain.Task;
import com.rakuten.summerinternship.database.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInit implements ApplicationRunner {

    private TaskRepository repository;

    @Autowired
    public DataBaseInit(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = repository.count();
        if (count == 0) {
            Task task = new Task();
            task.setTitle("testTitle");
            task.setDescription("testDescription");

            repository.save(task);
        }
	}
}
