package com.ats.controller;

import com.ats.entity.Employdetailes;
import com.ats.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empl")
public class Employ {
    @Autowired
    Test testService;

    @GetMapping("/detail")
    public Page<Employdetailes> Show(@RequestParam(required = true) int page,@RequestParam (defaultValue = "2")int size){
        return testService.get(page,size);
    }


}
