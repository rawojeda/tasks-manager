package com.solid.hexagonal.tasks_manager.domain.models;

import org.hibernate.tool.schema.internal.exec.ScriptSourceInputFromReader;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean complete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Task(Long id, String title, String description, LocalDateTime creationDate, boolean complete){
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.complete = true;
    }
}
