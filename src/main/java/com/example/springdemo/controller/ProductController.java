package com.example.springdemo.controller;

import com.example.springdemo.dto.ProductDto;
import com.example.springdemo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/product/")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("create")
    public ResponseEntity creatProduct(@RequestBody ProductDto productDto) {
        productService.save(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        return status(HttpStatus.OK).body(productService.getProduct(id));
    }
}
