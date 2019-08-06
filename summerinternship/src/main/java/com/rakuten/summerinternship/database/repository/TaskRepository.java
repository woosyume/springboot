package com.rakuten.summerinternship.database.repository;

import java.util.List;

import com.rakuten.summerinternship.database.domain.Task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    public List<Task> findById(int id);
}
