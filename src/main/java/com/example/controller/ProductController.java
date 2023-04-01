package com.example.controller;



import java.util.concurrent.atomic.AtomicLong;

import com.example.service.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/product")
    public Product product(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Product(counter.incrementAndGet(), String.format(template, name));
    }
}