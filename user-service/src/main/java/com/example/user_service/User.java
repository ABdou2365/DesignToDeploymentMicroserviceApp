package com.example.user_service;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // mutable so Hibernate can set it

    private String name;

    // Default constructor required by JPA
    public User() {
    }

    public Long getId() {
        return id;

    }
    public String getName() {
        return name;
    }

}
