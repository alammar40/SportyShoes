package com.example.springboot_jpa.controllers;

import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public Iterable<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
    @PostMapping("category/add")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
}
