package com.example.springboot_jpa.dto;

import com.example.springboot_jpa.entities.Purchase;

public record PurchaseDTO(Integer productID, Integer quantity) {
}
