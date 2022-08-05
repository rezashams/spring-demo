package com.example.springdemo.service;

import com.example.springdemo.dto.ProductDto;
import com.example.springdemo.exception.ProductNotFoundException;
import com.example.springdemo.mapper.ProductMapper;
import com.example.springdemo.model.Product;
import com.example.springdemo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    public void save(ProductDto productDto) {
        productRepository.save(productMapper.map(productDto));
    }
    @Transactional(readOnly = true)
    public ProductDto getProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id.toString()));
        return productMapper.mapToDto(product);
    }
}
