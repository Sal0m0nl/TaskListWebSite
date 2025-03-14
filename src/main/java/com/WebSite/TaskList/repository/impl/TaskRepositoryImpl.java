package com.WebSite.TaskList.repository.impl;

import com.WebSite.TaskList.domain.task.Task;
import com.WebSite.TaskList.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllTasksByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(Long userId, Long taskId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long id) {

    }
}
