package com.example.springboot_jpa.dao;


import com.example.springboot_jpa.entities.Category;
import com.example.springboot_jpa.entities.Purchase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.springboot_jpa.entities.SportyOrder;

import java.sql.Date;
import java.util.List;

public interface SportyOrderRepository extends CrudRepository<SportyOrder,Integer> {
    List<SportyOrder> findSportyOrderByDate(Date date);



}
