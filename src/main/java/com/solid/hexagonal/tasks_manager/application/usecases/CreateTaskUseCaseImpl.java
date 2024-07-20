package com.solid.hexagonal.tasks_manager.application.usecases;

import com.solid.hexagonal.tasks_manager.domain.models.Task;
import com.solid.hexagonal.tasks_manager.domain.ports.in.CreateTaskUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
