package com.example.springboot_jpa.services;

import com.example.springboot_jpa.dao.UserRepository;
import com.example.springboot_jpa.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public Iterable<User> getAllUser(){
        return userRepo.findAll();
    }
    public Optional<User> getUserByID(Integer userID){
        return userRepo.findById(userID);
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    //    public Iterable<Product> getAllProduct(){
    //        return productRepo.findAll();
    //    }

}
