package com.WebSite.TaskList.services.impl;

import com.WebSite.TaskList.domain.task.Task;
import com.WebSite.TaskList.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllTasksByUserId(Long userId) {
        return List.of();
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }

}
