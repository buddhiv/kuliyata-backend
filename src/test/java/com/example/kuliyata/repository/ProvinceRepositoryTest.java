package com.example.kuliyata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.Country;
import com.example.kuliyata.entity.Province;

@SpringBootTest
public class ProvinceRepositoryTest {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Test
    void saveProvince() {
        Province province = new Province();
        province.setName("Southern");

        Country country = new Country();
        country.setId(1L);
        province.setCountry(country);

        Province savedProvince = provinceRepository.save(province);
        System.out.println(savedProvince.getId());
    }
}
