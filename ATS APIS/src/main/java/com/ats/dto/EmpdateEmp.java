package com.ats.dto;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

@Component
public class EmpdateEmp {
    @Min(value=1) @Max(value=15,message = "min 1 and max 15 charcters  ")
    private  int id;
    @NotNull @NotBlank @NotEmpty(message = "please enter valid name")
    private String name;
    @NotBlank  @Pattern(regexp = "\\d{10}",message = "phno number must contain 10 digits")
   private String phno;
}
