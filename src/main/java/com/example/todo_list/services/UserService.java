package com.example.todo_list.services;


import com.example.todo_list.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void save(UserDto userDto);
    UserDto get(UUID id);
    List<UserDto> getAllTodo();
    void update(UUID id);
}
