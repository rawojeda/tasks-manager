package com.solid.hexagonal.tasks_manager.domain.ports.in;

import com.solid.hexagonal.tasks_manager.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTasks();
}
