package com.WebSite.TaskList.web.mappers;

import com.WebSite.TaskList.domain.user.User;
import com.WebSite.TaskList.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);

}
