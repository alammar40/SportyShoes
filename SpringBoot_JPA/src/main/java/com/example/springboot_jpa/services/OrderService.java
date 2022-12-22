package com.example.springboot_jpa.services;

import com.example.springboot_jpa.dao.PurchaseRepository;
import com.example.springboot_jpa.dao.SportyOrderRepository;
import com.example.springboot_jpa.dto.PurchaseDTO;
import com.example.springboot_jpa.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    SportyOrderRepository sportyOrderRepo;
    @Autowired
    PurchaseRepository purchaseRepo;

   public void addNewOrder(List<PurchaseDTO> rqs, Integer userID){
        SportyOrder order = new SportyOrder();
        order.setUser(new User(userID,""));
        sportyOrderRepo.save(order);
        for(PurchaseDTO req: rqs){
            Integer productID = req.productID();
            Integer quantity = req.quantity();
            Product product = new Product(productID);
            Purchase purchase = new Purchase(quantity,product,order);
            purchaseRepo.save(purchase);
        }
    }

    public List<SportyOrder> findSportyOrderByDate(Date date){
        return sportyOrderRepo.findSportyOrderByDate(date);
    }

    public List<Purchase> findByCategory(String category){
       return purchaseRepo.findByProductCategoryBrand(category);
    }
}
