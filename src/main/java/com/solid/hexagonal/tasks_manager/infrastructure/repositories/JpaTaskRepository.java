package com.solid.hexagonal.tasks_manager.infrastructure.repositories;

import com.solid.hexagonal.tasks_manager.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
