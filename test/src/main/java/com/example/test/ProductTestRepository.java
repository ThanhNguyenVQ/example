package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductTestRepository extends JpaRepository<ProductTest, Long> {
    @Procedure(name = "addproduct")
    void addProduct(@Param("name") String name, @Param("price") String price);
}
