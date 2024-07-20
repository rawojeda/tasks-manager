# Task Manager API

This project is a Task Manager API built with Spring, designed following the principles of Hexagonal Architecture (also known as Ports and Adapters Architecture). The goal is to provide a robust and maintainable codebase that allows easy integration with different frameworks and technologies.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Architecture](#architecture)
- [Installation](#installation)
- [Usage](#usage).

## Introduction

The Task Manager API is a RESTful service that allows users to manage their tasks. It supports creating, retrieving, updating, and deleting tasks, as well as fetching additional information about each task. The project is structured using Hexagonal Architecture to promote separation of concerns and improve testability.

## Features

- **Create Task**: Add a new task to the task manager.
- **Retrieve Task**: Fetch details of a specific task by ID.
- **Update Task**: Modify an existing task.
- **Delete Task**: Remove a task from the task manager.
- **List Tasks**: Get a list of all tasks.
- **Additional Task Info**: Retrieve supplementary information for a task.

## Architecture

This project follows the Hexagonal Architecture pattern, which divides the application into distinct layers, ensuring a clear separation of concerns. The main layers are:

1. **Domain Layer**: Contains the core business logic and domain models.
2. **Application Layer**: Handles the application's use cases and orchestrates the flow between the domain and infrastructure layers.
3. **Infrastructure Layer**: Implements the interfaces defined in the domain layer, including controllers, repositories, and external services.

### Project Structure
```
src
└── main.java.com.solid.hexagonal-tasks_manager
    ├── application
    │ ├── services
    │ │ └── TaskService.java
    │ └── usecases
    │   └── CreateTaskUseCaseImpl.java
    │   └── DeleteTaskUseCaseImpl.java
    │   └── GetAdditionalTaskInfoUseCaseImpl.java
    │   └── RetrieveTaskUseCaseImpl.java
    │   └── UpdateTaskUseCaseImpl.java
    ├── domain
    │ └── models
    │ │ └── AdditionalTaskInfo.java
    │ │ └── Task.java
    │ └── ports
    │   └── in
    │   │  ├── CreateTaskUseCase.java
    │   │  ├── DeleteTaskUseCase.java
    │   │  ├── GetAdditionalTaskInfoUseCase.java
    │   │  ├── RetrieveTaskUseCase.java
    │   │  └── UpdateTaskUseCase.java
    │   └── out
    │      ├── ExternalServicePort.java
    │      └── TaskRepositoryPort.java
    └── infrastructure
        └── adapters
        │ └── ExternalServiceAdapter.java
        └── config
        │ └── ApplicationConfig.java
        └── controllers
        │ └── TaskController.java
        └── entities
        │ └── TaskEntity.java
        └── repositories
            └── JpaTaskRepository.java
            └── JpaTaskRepositoryAdapter.java
```

## Installation

### Prerequisites

- Java 17
- MySQL (XAMPP)

### Steps

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/task-manager-api.git
    cd task-manager-api
    ```

2. Configure the MySQL database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tasks_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Build the project:
    ```sh
    mvn clean install
    ```

4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

## Usage

### Sample Request with Postman

To create a new task, you can use the following request in Postman:

- **Method**: `POST`
- **URL**: `localhost:8080/api/tasks`
- **Body(raw)**:
    {
        "title": "New Task",
        "description": "This is a new task",
        "complete": false
    }
- **Response**: `200 OK`
    ```json
    [
        {
            "id": 6,
            "title": "Una tarea nueva",
            "description": "Creacion de una tarea nueva de ejemplo",
            "creationDate": "2024-07-20T17:46:29.3593668",
            "complete": true
        }
    ]
    ```

And this to list all the Tasks:

- **Method**: `GET`
- **URL**: `localhost:8080/api/tasks`
- **Response**: `200 OK`
    ```json
    [
        {
            "id": 1,
            "title": "Crear aplicacion usando arquitectura hexagonal",
            "description": "Aplicacion de lista de tareas",
            "creationDate": "2024-07-11T16:21:08",
            "complete": true
        },
      ...
    ]
    ```
