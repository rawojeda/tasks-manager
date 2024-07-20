package com.solid.hexagonal.tasks_manager.domain.ports.in;

import com.solid.hexagonal.tasks_manager.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);

}
