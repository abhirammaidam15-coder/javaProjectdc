package com.ats.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Billing")
@Getter
@Setter
@NoArgsConstructor
public class Billing {
    @Id
    private int customerId;
    private String customerName;
    private Double unitsConsumed;
    private Double price;
}
