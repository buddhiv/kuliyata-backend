package com.example.kuliyata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.District;
import com.example.kuliyata.entity.Province;

@SpringBootTest
public class DistrictRepositoryTest {
    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private ProvinceRepository provinceRepository;

    @Test
    void saveDistrict() {
        District district = new District();
        district.setName("Galle");

        Province province = provinceRepository.findById(1L).get();
        district.setProvince(province);

        District savedDistrict = districtRepository.save(district);
        System.out.println(savedDistrict.getId());
    }
}
