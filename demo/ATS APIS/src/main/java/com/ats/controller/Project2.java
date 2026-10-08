package com.ats.controller;

import com.ats.dto.Detailes;
import com.ats.service.Test;
import com.ats.entity.Employdetailes;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/project")
class Project2 {
    @Autowired
    Test testService;

    @PostMapping("/save")
    public void save(@RequestBody Employdetailes employdetailes) {
        testService.detailers(employdetailes);
    }

    @GetMapping("/getuser")
    public Employdetailes getuserdetailes(@Valid @RequestParam String name, @RequestParam String email) {
        return testService.find(name, email);
    }

    @PutMapping("/update")
    public int updation(@RequestBody Employdetailes employdetailes, @RequestParam int id, @RequestParam String phno) {
        return testService.autoupdate(id, phno);
    }


    @DeleteMapping("/delete")
    public void delete(@RequestParam int id, @RequestParam String email) {
        testService.delete(id, email);
    }

    @PostMapping("/saveall")
    public Employdetailes saveall(@RequestBody Employdetailes employdetailes) {
        return testService.saveall(employdetailes);
    }

    @PutMapping("/updaterole")
    public void updaterole(@RequestBody Employdetailes employdetailes) {

        testService.updaterole(employdetailes);
    }

    @PutMapping("/updatename")
    public Employdetailes update(@RequestBody Employdetailes employdetailes) {
        return testService.updatename(employdetailes);
    }

    @PostMapping("/saving")
    public List save(@RequestParam(required = true) int id, @RequestParam(required = true) String name, @RequestParam(required = true) String password) {
        return testService.saved(id, name, password);
    }

    @PostMapping("/Billing")
    public Double Bill(@RequestBody Detailes detailesdto) {

        return testService.caluclate(detailesdto);
    }

}