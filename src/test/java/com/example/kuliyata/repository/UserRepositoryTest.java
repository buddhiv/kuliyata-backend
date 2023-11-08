package com.example.kuliyata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.User;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void saveUser() {
        User user = new User();
        user.setId(1L);
        user.setFirstName("Buddhi");
        user.setLastName("Vikasitha");
        user.setAddress("Hiripitiya Road, Pannipitiya");
        user.setEmail("buddhi@buddhi.com");
        user.setPassword("1234");

        User savedUser = userRepository.save(user);
        System.out.println(savedUser.getId());
    }
}
