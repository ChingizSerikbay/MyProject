package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon", 70000),
//            new Product(103, "Shure Mic", 10000)));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int prodId) {
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        productRepo.save(prod);
    }

    public void updateProduct(Product prod) {
        productRepo.save(prod);
    }


    public void deleteProduct(int prodId) {
        productRepo.deleteById(prodId);
    }
}
