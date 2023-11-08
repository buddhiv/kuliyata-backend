package com.example.kuliyata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kuliyata.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
