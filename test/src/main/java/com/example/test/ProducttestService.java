package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProducttestService {
    @Autowired
    private ProductTestRepository repo;

    public List<ProductTest> getAllProducts(){
        return repo.findAll();
    }

    public void addProduct(String name, String price) {
        BigDecimal decimalPrice = new BigDecimal(price);
        repo.addProduct(name, decimalPrice);
    }
}
