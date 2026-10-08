package com.ats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "eligibility")
@Getter
@Setter
public class AgeIdentifier{

    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "age")
    private int age;

}
