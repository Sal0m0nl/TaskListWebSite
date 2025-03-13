package com.WebSite.TaskList.domain.user;

import com.WebSite.TaskList.domain.task.Task;

import lombok.Data;
import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

}
