package com.solid.hexagonal.tasks_manager.infrastructure.config;

import com.solid.hexagonal.tasks_manager.application.services.TaskService;
import com.solid.hexagonal.tasks_manager.application.usecases.*;
import com.solid.hexagonal.tasks_manager.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.ExternalServicePort;
import com.solid.hexagonal.tasks_manager.domain.ports.out.TaskRepositoryPort;
import com.solid.hexagonal.tasks_manager.infrastructure.adapters.ExternalServiceAdapter;
import com.solid.hexagonal.tasks_manager.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }
    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
