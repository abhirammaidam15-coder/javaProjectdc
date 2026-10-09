package com.ats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/check/age")
public class Age {
    @Autowired
    com.ats.service.AgeIdentifier ageService;

    @PostMapping("checking")
    public String checker(@RequestParam int age){
        return ageService.checking(age);
    }

}
