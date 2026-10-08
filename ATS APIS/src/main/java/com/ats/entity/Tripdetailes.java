package com.ats.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Tripdetailes")
public class Tripdetailes {
    @Id
    private String Id;

    private int flag;
    private List<String> latLongsStringList;
    private  String  tenantId;
}

