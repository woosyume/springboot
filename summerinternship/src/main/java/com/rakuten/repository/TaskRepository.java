package com.rakuten.repository;

import java.util.List;

import com.rakuten.domain.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findById(int id);
}
