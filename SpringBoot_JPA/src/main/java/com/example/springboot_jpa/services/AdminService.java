package com.example.springboot_jpa.services;

import com.example.springboot_jpa.dao.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository AdminRepo;
    public String login(String password){
        if(password.equals("1234")){
            return "You are logged in";
        }else{
            return "Invalid password";
        }
    }

}
