package com.example.kuliyata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.Country;

@SpringBootTest
public class CountryRepositoryTest {
    @Autowired
    private CountryRepository countryRepository;

    @Test
    void saveCountry() {
        Country country = new Country();
        country.setName("Sri Lanka");
        country.setCountryCode("LK");

        Country savedCountry = countryRepository.save(country);
        System.out.println(savedCountry.getId());
        System.out.println(savedCountry.toString());
    }

    
}
