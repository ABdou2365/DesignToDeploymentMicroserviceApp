package com.example;

import jakarta.persistence.*;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;

    }
    public String getName() {
        return name;
    }

}
