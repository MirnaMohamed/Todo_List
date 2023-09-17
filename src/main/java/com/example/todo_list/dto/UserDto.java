package com.example.todo_list.dto;

import com.example.todo_list.model.Category;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private List<Category> category;

}
