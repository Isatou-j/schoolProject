package com.schoolProject.ecommerceApplication.repository;

import com.schoolProject.ecommerceApplication.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByCategoryId(Long category);

    List<Product> findNameContainingOrderDescriptionContaining(String name, String description);
}
