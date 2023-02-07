package com.myapp.springdatajpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    private Long id;
    private String rating;
    private String description;
}
