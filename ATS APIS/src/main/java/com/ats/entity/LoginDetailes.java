package com.ats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table (name="Login")
@Entity
@Getter
@Setter
public class LoginDetailes {
    @Id
    @Column(name="Id",nullable = false,unique = true)
    private int Id;
    @Column(name="Name",nullable = false,unique = false)
    private String name;
    @Column(name = "Password",nullable = false,unique = true)
    private String password;
}

