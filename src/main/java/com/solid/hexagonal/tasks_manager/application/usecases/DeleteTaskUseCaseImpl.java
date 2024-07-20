package com.solid.hexagonal.tasks_manager.application.usecases;

import com.solid.hexagonal.tasks_manager.domain.ports.in.DeleteTaskUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
