package com.example.todo_list.mapper;

import com.example.todo_list.dto.TodoDto;
import com.example.todo_list.model.Todo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoDto ToTodoDto(Todo todo);
    Todo ToTodo(TodoDto todoDto);
}
