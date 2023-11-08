package com.example.kuliyata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kuliyata.entity.Province;


public interface ProvinceRepository extends JpaRepository<Province, Long> {
    
}
