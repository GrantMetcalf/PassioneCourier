package com.PassioneCourier.group2.controller.user;


import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.Factory.user.EmployerFactory;
import com.PassioneCourier.group2.service.user.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employer")
public class EmployerController {


    @Autowired
    private EmployerService empService;

    @PostMapping( "/create")
    public Employer create(@RequestBody Employer emp) {
        Employer newEmp = EmployerFactory.createEmployer(emp.getFirstName(), emp.getLastName());
        return empService.create(newEmp);

    }

    @GetMapping("/all")
    public Set<Employer> getAll(){
        return empService.getAll();
    }
}
