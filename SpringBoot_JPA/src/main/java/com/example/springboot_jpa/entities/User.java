package com.example.springboot_jpa.entities;



import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;

    private String email;

    public User(Integer userID, String email) {
        this.userID = userID;
        this.email = email;
    }
    public User() {
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
