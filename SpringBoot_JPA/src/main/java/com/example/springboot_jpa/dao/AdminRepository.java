package com.example.springboot_jpa.dao;

import com.example.springboot_jpa.entities.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String> {
}
