package com.ats.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity



@Table(name ="ep")
@Getter
@Setter
public class Secret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "role")
        private String role;

        @Column(name = "adresses")
        private String adresses;
}
