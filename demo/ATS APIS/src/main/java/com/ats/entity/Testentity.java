package com.ats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employdata")
public class Testentity {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private int Id;
    @Column(name = "name", nullable = false, unique = false)
    private String name;
    @Column(name = "password", nullable = false, unique = false)
    private String password;
}