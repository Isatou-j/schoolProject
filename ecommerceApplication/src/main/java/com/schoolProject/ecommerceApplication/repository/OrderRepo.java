package com.schoolProject.ecommerceApplication.repository;

import com.schoolProject.ecommerceApplication.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
