package com.WebSite.TaskList.repository;

import com.WebSite.TaskList.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllTasksByUserId(Long userId);

    void assignToUserById(Long userId, Long taskId);

    void update(Task task);

    void create(Task task);

    void delete(Long id);

}
