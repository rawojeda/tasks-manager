package com.solid.hexagonal.tasks_manager.application.usecases;

import com.solid.hexagonal.tasks_manager.domain.models.Task;
import com.solid.hexagonal.tasks_manager.domain.ports.in.UpdateTaskUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
