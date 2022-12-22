package com.example.springboot_jpa.controllers;

import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.entities.Product;
import com.example.springboot_jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public Iterable<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @PostMapping("product/{brand}")
    public void addProduct(@RequestBody Product product,@PathVariable String brand){
        productService.addProduct(product,brand);
    }
}
