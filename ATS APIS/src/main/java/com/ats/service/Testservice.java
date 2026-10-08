package com.ats.service;

import com.ats.repository.Testrepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.InvalidModuleDescriptorException;
import java.util.Optional;

@Service
public class Testservice {
    @Autowired
    Testrepo2 testrepo2 ;
    public String log(int id,String name,String password){
       Optional<Boolean>num = Optional.of(testrepo2.existsByNameAndPassword(name, password));
         if(num.get()){
             return "valid";
         }else{
             return "Invalid";
         }
    }
}
