package com.example.springboot_jpa.dao;

import com.example.springboot_jpa.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
