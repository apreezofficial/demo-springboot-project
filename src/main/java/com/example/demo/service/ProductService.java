package com.example.demo.service;

import com.example.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;t
import java.util.List;

@Service
public class ProductService {

   List<Products> products =  new ArrayList<>(Arrays.asList(
           new Products(101, 50000, "Iphone"),
           new Products(102, 90000, "Computer")));

    public List<Products> getProducts(){
        return products;
    }

    public Products getProductsById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Products(0, 0 , "Nulll"));
    }

    public void addProduct(Products prod){
        products.add(prod);
    }
}
