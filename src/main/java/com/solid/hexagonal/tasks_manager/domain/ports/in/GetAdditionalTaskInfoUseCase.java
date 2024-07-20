package com.solid.hexagonal.tasks_manager.domain.ports.in;

import com.solid.hexagonal.tasks_manager.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
