package com.ats.controller;
import com.ats.service.LoginValidation;
import com.ats.service.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/check")
public class Login {

    @Autowired
    LoginValidation loginValidation;
@Autowired
Test testService;


@GetMapping("/check/ggett")
public List getting(){
return  testService.get();
}

    @PostMapping("/login")
 public <LoginDetailes> boolean check(@RequestBody LoginDetailes loginDetailes){

       return loginValidation.validation((com.ats.entity.LoginDetailes) loginDetailes);
    }
}