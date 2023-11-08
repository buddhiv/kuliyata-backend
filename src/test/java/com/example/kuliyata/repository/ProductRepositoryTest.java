package com.example.kuliyata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kuliyata.entity.District;
import com.example.kuliyata.entity.Product;
import com.example.kuliyata.entity.User;

@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveProduct() {
        // create a product
        Product product = new Product();
        product.setTitle("Rubik Cube");
        product.setDescription("6 Sided Rubik Cube");

        District district = new District();
        district.setId(1L);
        product.setDistrict(district);

        User user = new User();
        user.setId(1L);
        product.setCreatedBy(user);

        Product savedProduct = productRepository.save(product);
        System.out.println(savedProduct.getId());
    }

    // @Test
    // void updateUsingSave() {
    // // retrive an entity by id
    // Long id = 1L;
    // Product product = productRepository.findById(id).get();

    // // update retrieved entity
    // product.setName("Updated description");

    // // save updated entity
    // productRepository.save(product);
    // }

    // @Test
    // void findById() {
    // Long id = 1L;

    // Product product = productRepository.findById(id).get();

    // // show the retrieved product information
    // System.out.println(product.getId());
    // System.out.println(product.toString());
    // }

    // @Test
    // void saveAllMethod() {
    // Product product1 = new Product();
    // product1.setName("Product 1");
    // product1.setDescription("Product 1 description");
    // product1.setPrice(new BigDecimal(100000));
    // product1.setImageUrl(null);

    // Product product2 = new Product();
    // product2.setName("Product 1");
    // product2.setDescription("Product 1 description");
    // product2.setPrice(new BigDecimal(100000));
    // product2.setImageUrl(null);

    // Product product3 = new Product();
    // product3.setName("Product 1");
    // product3.setDescription("Product 1 description");
    // product3.setPrice(new BigDecimal(100000));
    // product3.setImageUrl(null);

    // productRepository.saveAll(List.of(product1, product2, product3));
    // }

    // @Test
    // void findAllProducts() {
    // List<Product> products = productRepository.findAll();

    // products.forEach((product) -> {
    // System.out.println(product.toString());
    // });
    // }

    // @Test
    // void deleteById(){
    // Long id = 1L;

    // productRepository.deleteById(id);
    // }

    // @Test
    // void delete() {
    // // find entity by id
    // Long id = 2L;

    // Product product = productRepository.findById(id).get();

    // // call delete
    // productRepository.delete(product);
    // }

    // @Test
    // void deleteAllProducts() {
    // productRepository.deleteAll();
    // }

    // @Test
    // void count() {
    // Long count = productRepository.count();
    // System.out.println(count);
    // }

    // @Test
    // void existsById() {
    // Long id = 1L;
    // boolean exists = productRepository.existsById(id);

    // System.out.println(exists);
    // }
}
