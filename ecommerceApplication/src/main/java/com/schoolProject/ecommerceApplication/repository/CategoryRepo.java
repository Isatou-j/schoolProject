package com.schoolProject.ecommerceApplication.repository;

import com.schoolProject.ecommerceApplication.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
