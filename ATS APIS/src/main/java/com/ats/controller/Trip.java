package com.ats.controller;

import com.ats.entity.Tripdetailes;
import com.ats.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trip")
public class Trip {
    @Autowired
    Test test;
    @PostMapping("save")
    public Tripdetailes  save(@RequestBody Tripdetailes tripdetailes){
      return test.savee(tripdetailes);
    }
    @GetMapping("get")
    public Tripdetailes gett(@RequestParam  String Id){
        return (Tripdetailes) test.gett(Id);
    }
}

