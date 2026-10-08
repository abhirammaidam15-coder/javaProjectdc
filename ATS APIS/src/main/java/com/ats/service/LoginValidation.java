package com.ats.service;

import com.ats.entity.LoginDetailes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class LoginValidation {

    @Autowired
    private com.ats.repository.LoginMethod loginRepositary;
   @Cacheable(value = "name",key = "#id")
    public boolean validation(LoginDetailes loginDetailes) {

        String name = loginDetailes.getName();
        String password = loginDetailes.getPassword();

        if(loginRepositary.existsByNameAndPassword(name, password)) {
            return true;
        }else {

            return false;
        }
    }

}

