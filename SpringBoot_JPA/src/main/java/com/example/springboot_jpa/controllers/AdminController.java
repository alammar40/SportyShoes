package com.example.springboot_jpa.controllers;

import com.example.springboot_jpa.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/admin/login/{password}")
    public String login(@PathVariable String password){
        return adminService.login(password);
    }
}
