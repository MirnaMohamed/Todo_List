package com.example.todo_list.services;

import com.example.todo_list.dto.TodoDto;

import java.util.List;

public interface TodoService {
    void save(TodoDto todoDto);
    TodoDto get(int id);
    List<TodoDto> getAllTodo();
    void update(int id);
}
