package com.example.springboot_jpa.dao;

import com.example.springboot_jpa.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
