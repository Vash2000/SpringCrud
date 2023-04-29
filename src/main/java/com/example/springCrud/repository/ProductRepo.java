package com.example.springCrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springCrud.model.Employee;

public interface ProductRepo extends JpaRepository<Employee,Integer>{

    Optional<Employee> findByName(String name);
    
}
