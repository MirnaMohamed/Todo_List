package com.example.todo_list.services;

import com.example.todo_list.dto.CategoryDto;
import com.example.todo_list.mapper.CategoryMapper;
import com.example.todo_list.model.Category;
import com.example.todo_list.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    CategoryRepository categoryRepository;
    @Autowired
    CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String save(CategoryDto categoryDto) {
        Category category= categoryMapper.ToCategory(categoryDto);
        categoryRepository.save(category);
        return "Category added successfully";
    }

    @Override
    public CategoryDto get(int id) {
        Optional<Category> category = categoryRepository.findById(id);
        CategoryDto categoryDto;
        if(category != null){
             categoryDto= categoryMapper.ToCategoryDto(category.get());
             return categoryDto;}
        else throw new NotFoundException("Category Not Found");
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();
        categories.forEach(c->
                categoryDtos.add(categoryMapper.ToCategoryDto(c)));
        return categoryDtos;
    }

    @Override
    public void update(int id) {

    }
}
