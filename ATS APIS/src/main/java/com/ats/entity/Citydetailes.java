package com.ats.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "states")
@Getter
@Setter
public class Citydetailes {

        @Id

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "state_id")

        private Integer stateId;

        @Column(name = "state_name", nullable = false)

        private String stateName;

        @Column(name = "pincode", nullable = false)

        private String pincode;



}
