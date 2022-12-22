package com.example.springboot_jpa.controllers;
import com.example.springboot_jpa.entities.User;
import com.example.springboot_jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{userID}")
    public Optional<User> getUserByID(@PathVariable Integer userID){
        return userService.getUserByID(userID);
    }

    @PostMapping("/user/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/user")
    public Iterable<User> getAllUser(){
        return userService.getAllUser();
    }
}
