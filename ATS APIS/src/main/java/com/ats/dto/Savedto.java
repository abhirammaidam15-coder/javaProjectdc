package com.ats.dto;

import java.io.Serializable;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "savedata")
@Getter
@Setter
public class Savedto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;
    private String password;
}