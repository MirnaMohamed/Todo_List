package com.example.todo_list.mapper;

import com.example.todo_list.dto.UserDto;
import com.example.todo_list.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User ToUser(UserDto userDto);
    UserDto ToUserDto(User user);
}
