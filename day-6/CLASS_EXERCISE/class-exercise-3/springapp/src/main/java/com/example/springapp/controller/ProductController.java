package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
}
