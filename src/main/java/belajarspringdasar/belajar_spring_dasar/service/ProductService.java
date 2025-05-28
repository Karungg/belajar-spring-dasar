package belajarspringdasar.belajar_spring_dasar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belajarspringdasar.belajar_spring_dasar.repository.ProductRepository;
import lombok.Getter;

@Component
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
