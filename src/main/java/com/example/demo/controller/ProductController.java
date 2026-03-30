package com.example.demo.controller;

import com.example.demo.model.Products;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable int prodId) {
    return service.getProductsById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Products prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
}
