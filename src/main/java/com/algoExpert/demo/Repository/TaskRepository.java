package com.algoExpert.demo.Repository;

import com.algoExpert.demo.Entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
