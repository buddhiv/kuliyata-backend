package com.example.kuliyata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kuliyata.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Product findByName(String name);
}
