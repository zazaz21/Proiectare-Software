package com.example.controller;
/**

 This class represents a REST controller for Product related requests.
 It provides endpoints for getting a Product object with a name and an ID.
 It uses an AtomicLong counter to generate unique IDs for each Product.
 */



import java.util.concurrent.atomic.AtomicLong;

import com.example.service.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    /**
     * The template string used to format a Product's name.
     */
    private static final String template = "Hello, %s!";

    /**
     * The counter used to generate unique IDs for each Product.
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * Returns a Product object with a name and a unique ID.
     * @param name the name to be included in the Product object's name field
     * @return a Product object with a unique ID and the name formatted according to the template string
     */
    @GetMapping("/product")
    public Product product(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Product(counter.incrementAndGet(), String.format(template, name));
    }
}