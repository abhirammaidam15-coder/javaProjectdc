package com.ats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import java.util.Optional;

@Service
public class AgeIdentifier {

    @Autowired
   private com.ats.repository.AgeMethod ageRepositery;

    public String checking(int age) {

        Optional<com.ats.entity.AgeIdentifier> data = ageRepositery.findByAge(age);

        if (data.isPresent()) {
            int s = data.get().getAge();

            if (s >= 18) {
                return "Eligible";
            } else {
                return "Not Eligible";
            }
        }

        return "No data found";
    }
    }