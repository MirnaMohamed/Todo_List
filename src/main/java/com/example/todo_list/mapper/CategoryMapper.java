package com.example.todo_list.mapper;

import com.example.todo_list.dto.CategoryDto;
import com.example.todo_list.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto ToCategoryDto(Category category);

    Category ToCategory(CategoryDto categoryDto);
}
