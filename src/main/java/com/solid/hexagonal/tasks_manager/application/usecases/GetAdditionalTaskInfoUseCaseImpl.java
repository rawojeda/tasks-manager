package com.solid.hexagonal.tasks_manager.application.usecases;

import com.solid.hexagonal.tasks_manager.domain.models.AdditionalTaskInfo;
import com.solid.hexagonal.tasks_manager.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.solid.hexagonal.tasks_manager.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
