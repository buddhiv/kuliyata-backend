package com.example.kuliyata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kuliyata.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
