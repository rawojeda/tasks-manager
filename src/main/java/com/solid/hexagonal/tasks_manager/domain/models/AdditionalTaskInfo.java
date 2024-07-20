package com.solid.hexagonal.tasks_manager.domain.models;

public class AdditionalTaskInfo {
    private final Long userId;
    private final String userName;
    private final String userEmail;

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public AdditionalTaskInfo(Long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }
}
