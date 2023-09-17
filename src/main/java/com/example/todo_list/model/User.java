package com.example.todo_list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
@Entity
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Category> category;

    public User() {
        this.id = UUID.randomUUID();
    }
}
