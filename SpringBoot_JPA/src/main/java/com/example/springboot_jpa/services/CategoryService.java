package com.example.springboot_jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.dao.CategoryRepository;
@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepo;
    public Iterable<Category> getAllCategory(){
        return categoryRepo.findAll();
    }
    public void addCategory(Category category){
        categoryRepo.save(category);
    }

}
