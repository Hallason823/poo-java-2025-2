package com.example.first_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first_spring_boot.exceptions.ResourceNotFoundException;
import com.example.first_spring_boot.model.Product;
import com.example.first_spring_boot.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + " - not found."));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(long id) {
        if (!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("Product with ID " + id + " - not found.");
        }
        productRepository.deleteById(id);
    }
}