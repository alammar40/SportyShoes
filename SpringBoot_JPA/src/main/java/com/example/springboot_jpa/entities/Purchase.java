package com.example.springboot_jpa.entities;

import jakarta.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer purchaseID;
    private Integer quantity;
    @ManyToOne
    Product product;
    @ManyToOne
    SportyOrder sportyOrder;

    public Purchase(Integer purchaseID, Integer quantity, Product product, SportyOrder sportyOrder) {
        this.purchaseID = purchaseID;
        this.quantity = quantity;
        this.product = product;
        this.sportyOrder = sportyOrder;
    }
    public Purchase(Integer quantity, Product product, SportyOrder sportyOrder) {
        this.quantity = quantity;
        this.product = product;
        this.sportyOrder = sportyOrder;
    }

    public Purchase() {
    }

    public Integer getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(Integer purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SportyOrder getSportyOrder() {
        return sportyOrder;
    }

    public void setSportyOrder(SportyOrder sportyOrder) {
        this.sportyOrder = sportyOrder;
    }
}
