package com.ats.controller;

import com.ats.dto.Logdetailesdto;
import com.ats.entity.LoginDetailes;
import com.ats.service.Testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trial {
    @Autowired
    Testservice testservice;

    @PostMapping("log")
    public String logdetailes(@RequestBody Logdetailesdto logdto){

        return testservice.log(logdto.getId(),logdto.getName(),logdto.getPassword());
    }
}
