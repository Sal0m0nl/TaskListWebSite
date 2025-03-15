package com.WebSite.TaskList.web.mappers;


import com.WebSite.TaskList.domain.task.Task;
import com.WebSite.TaskList.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);

}
