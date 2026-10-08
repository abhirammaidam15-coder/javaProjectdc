package com.ats.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "cities")
@Getter
@Setter
public class
City {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "city_id")

    private Integer cityId;

    @Column(name = "city_name", nullable = false)

    private String cityName;

    @Getter
    @Setter
    @Column(name = "pincode", nullable = false)

    private String pincode;

    @ManyToOne

    @JoinColumn(name = "state_id", nullable = false)

    private Citydetailes state;

    // Getters and Setters

}
