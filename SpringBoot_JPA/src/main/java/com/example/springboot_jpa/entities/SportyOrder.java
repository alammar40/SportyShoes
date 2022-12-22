package com.example.springboot_jpa.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
public class SportyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderID;
    private Date date;
    @ManyToOne
    private User user;

    public SportyOrder(Integer orderID, User user) {
        this.orderID = orderID;
        this.date = Date.valueOf(LocalDate.now());
        this.user = user;
    }

    public SportyOrder() {
        this.date = Date.valueOf(LocalDate.now());
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
