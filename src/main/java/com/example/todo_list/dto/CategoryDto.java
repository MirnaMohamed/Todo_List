package com.example.todo_list.dto;

import com.example.todo_list.model.Todo;
import com.example.todo_list.model.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CategoryDto {
    private int id;
    private String name;
    private String description;
    private User user;
    private List<Todo> todoList;
}
