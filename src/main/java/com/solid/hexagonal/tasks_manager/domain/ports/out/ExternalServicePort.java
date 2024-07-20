package com.solid.hexagonal.tasks_manager.domain.ports.out;

import com.solid.hexagonal.tasks_manager.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
