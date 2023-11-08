package com.example.kuliyata.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.User;
import com.example.kuliyata.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void getAllUsers() {
        List<User> users = userRepository.findAll();

        System.out.println(users);
        System.out.println(users.size());
    }
}
