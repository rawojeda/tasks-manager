package com.solid.hexagonal.tasks_manager.domain.ports.in;

import com.solid.hexagonal.tasks_manager.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
