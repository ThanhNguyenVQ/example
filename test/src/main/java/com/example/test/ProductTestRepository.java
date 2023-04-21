package com.example.test;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTestRepository extends JpaRepository<ProductTest, Long>{
    @Query(value = "CALL addproduct(?1, ?2)", nativeQuery = true)
    void addProduct(String name, BigDecimal price);
}