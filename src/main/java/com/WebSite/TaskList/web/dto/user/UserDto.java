package com.WebSite.TaskList.web.dto.user;

import com.WebSite.TaskList.web.dto.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must be not null")
    private String name;

    @NotNull(message = "Username must be not null")
    private String username;

    private String password;

    private String passwordConfirmation;

}
