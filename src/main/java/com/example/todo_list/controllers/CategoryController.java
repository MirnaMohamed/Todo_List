package com.example.todo_list.controllers;

import com.example.todo_list.dto.CategoryDto;
import com.example.todo_list.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("{id}")
    public ResponseEntity<CategoryDto> getById(@PathVariable int id){
        return new ResponseEntity<>(categoryService.get(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> add(CategoryDto categoryDto){
        return new ResponseEntity<>(categoryService.save(categoryDto), HttpStatus.CREATED);
    }
}
