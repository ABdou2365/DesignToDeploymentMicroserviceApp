package com.example.order_service;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String item;

    public Order() {
    }

    public Order(Long userId, String name) {
        this.userId = userId;
        this.item = name;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getItem() {
        return item;
    }

}
