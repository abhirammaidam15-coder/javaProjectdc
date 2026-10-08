package com.ats.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="emp_details1")
public class Employdetailes {

    @Column(name = "id", nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "phno", nullable = false)
    private String phno;

    @Column(name = "emergency_contact", nullable = false)
    private String emergencyContact;

}
