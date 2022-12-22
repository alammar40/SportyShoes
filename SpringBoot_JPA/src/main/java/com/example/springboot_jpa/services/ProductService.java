package com.example.springboot_jpa.services;

import com.example.springboot_jpa.dao.ProductRepository;
import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepo;

    public Iterable<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public void addProduct(Product product, String brand){
        product.setCategory(new Category(brand));
        productRepo.save(product);
    }

}
