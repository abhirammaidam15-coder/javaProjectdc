package com.ats.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Detailes {


    private int  customerId;
    @NotNull
    @NotEmpty(message = "complte the followinhg")
    @Size(max = 11,min = 3)
   private String  customerName;
    @NotNull
    @Positive

    @Max(value = 4000)
  private Double unitsConsumed;
}
