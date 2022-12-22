package com.example.springboot_jpa.dao;

import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.entities.Purchase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PurchaseRepository extends CrudRepository<Purchase,Integer> {

//    @Query(value = "select pch.purchaseid,pch.quantity,p.product_name as name , p.category_brand as category from purchase pch JOIN product p ON pch.product_productid = p.productid WHERE category_brand = ?1", nativeQuery = true)
//    List<Purchase> findByCategory(String category);

    List<Purchase> findByProductCategoryBrand(String brand);
}
