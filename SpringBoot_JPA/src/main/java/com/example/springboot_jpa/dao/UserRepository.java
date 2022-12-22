package com.example.springboot_jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_jpa.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
