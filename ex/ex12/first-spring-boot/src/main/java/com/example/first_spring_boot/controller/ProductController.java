package com.example.first_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring_boot.model.Product;
import com.example.first_spring_boot.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public Product addNewProduct(@RequestBody Product product) {        
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
    
}
