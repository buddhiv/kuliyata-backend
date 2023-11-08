package com.example.kuliyata.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.kuliyata.entity.Product;
import com.example.kuliyata.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/product/{id}")
    public Product getProductById (@PathVariable Long id) {
        return productService.getProductById(id);
    }
    
}
