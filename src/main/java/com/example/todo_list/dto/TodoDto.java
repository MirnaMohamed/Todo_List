package com.example.todo_list.dto;

import com.example.todo_list.model.Category;
import lombok.*;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private int id;
    private String name;
    private String description;
    private ZonedDateTime startDate;
    private boolean done;
    private boolean favorite;
    private Category category;
}
