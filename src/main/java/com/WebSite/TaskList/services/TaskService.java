package com.WebSite.TaskList.services;

import com.WebSite.TaskList.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllTasksByUserId(Long userId);

    Task update(Task task);

    Task create(Task task);

}
