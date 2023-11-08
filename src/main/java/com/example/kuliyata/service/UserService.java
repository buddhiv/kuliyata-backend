package com.example.kuliyata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.kuliyata.entity.User;
import com.example.kuliyata.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
