package com.solid.hexagonal.tasks_manager.application.usecases;

import com.solid.hexagonal.tasks_manager.domain.models.Task;
import com.solid.hexagonal.tasks_manager.domain.ports.in.RetrieveTaskUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
