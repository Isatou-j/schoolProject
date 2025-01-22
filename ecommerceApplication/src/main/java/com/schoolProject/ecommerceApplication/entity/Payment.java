package com.schoolProject.ecommerceApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private BigDecimal amount;
    private String method;
    private String status;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

}
