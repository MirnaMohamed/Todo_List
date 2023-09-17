package com.example.todo_list.services;

import com.example.todo_list.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    String save(CategoryDto categoryDto);
    CategoryDto get(int id);
    List<CategoryDto> getAllCategories();
    void update(int id);
}
