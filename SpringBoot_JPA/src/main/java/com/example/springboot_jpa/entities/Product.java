package com.example.springboot_jpa.entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productID;
    private String productName;
    private String productPrice;
    @ManyToOne
    Category category;

    public Product(Integer productID, String productName, String productPrice, String brand, Category category) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product() {
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
