package com.solid.hexagonal.tasks_manager.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
