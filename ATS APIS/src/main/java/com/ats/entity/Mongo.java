package com.ats.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employes")
@Getter
@Setter
@NoArgsConstructor
public class Mongo {
    private String name;
    private  String password;
   private int empId;

}
