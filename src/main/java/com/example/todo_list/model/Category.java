package com.example.todo_list.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
public class Category implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Todo> todoList;

}
