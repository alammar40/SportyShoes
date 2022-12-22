package com.example.springboot_jpa.controllers;

import com.example.springboot_jpa.dto.PurchaseDTO;
import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.entities.Purchase;
import com.example.springboot_jpa.entities.SportyOrder;
import com.example.springboot_jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/order/{userID}")
    public void addNewOrder(@RequestBody List<PurchaseDTO> purchaseDTO, @PathVariable Integer userID){
        orderService.addNewOrder(purchaseDTO, userID);
    }

    @GetMapping("/order/date/{date}")
    List<SportyOrder> findSportyOrderByDate(@PathVariable Date date){
        return orderService.findSportyOrderByDate(date);
    }

    @GetMapping("/order/category/{category}")
    public List<Purchase> findByCategory(@PathVariable String category){
        return orderService.findByCategory(category);
    }

//    public List<SportyOrder> findSportyOrderByDate(Date date){
//        return sportyOrderRepo.findSportyOrderByDate((java.sql.Date) date);
//    }

}
