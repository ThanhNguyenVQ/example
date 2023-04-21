package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

@Service
public class ProducttestService {
    @Autowired
    private ProductTestRepository repo;

    public List<ProductTest> getAllProducts(){
        return repo.findAll();
    }

    public void addProduct(String name, String price) {
        try {
            BigDecimal bigDecimalValue = new BigDecimal(price);
            repo.addProduct(name, bigDecimalValue);
        } catch (NumberFormatException e) {
            // Xử lý lỗi nếu giá trị đầu vào không hợp lệ
            e.printStackTrace();
        }
    }
}
