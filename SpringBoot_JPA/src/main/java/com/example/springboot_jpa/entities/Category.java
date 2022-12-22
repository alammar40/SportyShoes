package com.example.springboot_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Category {
    @Id
    private String brand;

    public Category(String brand) {
        this.brand = brand;
    }

    public Category() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
