package com.example.todo_list.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private ZonedDateTime startDate;
    private boolean done;
    private boolean favorite;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Category category;
}
